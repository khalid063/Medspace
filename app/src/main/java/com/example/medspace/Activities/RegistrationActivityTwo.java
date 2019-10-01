package com.example.medspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medspace.MainActivity;
import com.example.medspace.R;
import com.example.medspace.Retrofit.RetrofitClient;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationActivityTwo extends AppCompatActivity {

    private Button buttonSubmit;
    private EditText editTextUserName, editTextEmail, editTextPassword, editTextConfirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_two);


        buttonSubmit = findViewById(R.id.submitButton);

        editTextUserName = findViewById(R.id.userName);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextConfirmPass = findViewById(R.id.confirmPassword);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrationActivityTwo.this, "" +
                        "submit button is pressed", Toast.LENGTH_SHORT).show();

                userRegistration();
            }

            private void userRegistration() {
                String userName = editTextUserName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                String confirmPassword = editTextConfirmPass.getText().toString();


                Call<ResponseBody> call = RetrofitClient
                        .getInstance()
                        .getApi()
                        .creatUser(userName, email, password, confirmPassword);

                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                        try {
                            String s = response.body().string();
                            Toast.makeText(RegistrationActivityTwo.this, s, Toast.LENGTH_SHORT).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                            Toast.makeText(RegistrationActivityTwo.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });


            }
        });


    }
}
