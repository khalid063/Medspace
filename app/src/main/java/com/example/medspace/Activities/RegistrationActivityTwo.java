package com.example.medspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medspace.MainActivity;
import com.example.medspace.Model.CreatUserResponse;
import com.example.medspace.R;
import com.example.medspace.Retrofit.RetrofitClient;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrationActivityTwo extends AppCompatActivity {

    private Button buttonSubmit;
    // for rest api
    private EditText editTextUserName, editTextEmail, editTextPassword, editTextConfirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_two);


        buttonSubmit = findViewById(R.id.submitButton);

        // for rest api
        editTextUserName = findViewById(R.id.userName);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextConfirmPass = findViewById(R.id.confirmPassword);


        // for rest api
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

                Log.d("Tag_msg", "parems " + userName + ", " + email + ", "+ password +", "+ confirmPassword );


                Call<CreatUserResponse> call = RetrofitClient
                        .getInstance()
                        .getApi()
                        .creatUser( "4358cd151d116939800592f71de56335",userName, password, email, confirmPassword);

                call.enqueue(new Callback<CreatUserResponse>() {
                    @Override
                    public void onResponse(Call<CreatUserResponse> call, Response<CreatUserResponse> response) {


                            CreatUserResponse s = response.body();
                            Toast.makeText(RegistrationActivityTwo.this, s.getUserId(), Toast.LENGTH_SHORT).show();
                            Log.d("Tag_msg",  "Response "+ s.getAccessToken());


                    }

                    @Override
                    public void onFailure(Call<CreatUserResponse> call, Throwable t) {
                            Toast.makeText(RegistrationActivityTwo.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });


            }
        });


    }
}
