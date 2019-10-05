package com.example.medspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medspace.LoginActivity;
import com.example.medspace.Model.CreatUserResponse;
import com.example.medspace.Model.ForgetPasswordResponse;
import com.example.medspace.R;
import com.example.medspace.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ForgetPasswordActivity extends AppCompatActivity {

    private Button buttonForgetPassword;
    private EditText etForgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);


        buttonForgetPassword = findViewById(R.id.forgetPasswordId);
        etForgetPassword = findViewById(R.id.etForgetPasswordId);

        buttonForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = etForgetPassword.getText().toString();

                Log.d("Tag_msg_One", "parems " + email);

                Call<ForgetPasswordResponse> call = RetrofitClient
                        .getInstance()
                        .getApi()
                        .forgetPassword("4358cd151d116939800592f71de56335",email);

                call.enqueue(new Callback<ForgetPasswordResponse>() {
                    @Override
                    public void onResponse(Call<ForgetPasswordResponse> call, Response<ForgetPasswordResponse> response) {
                        ForgetPasswordResponse s = response.body();
                        //Toast.makeText(ForgetPasswordActivity.this, s.getApiStatus(), Toast.LENGTH_SHORT).show();
                        Log.d("Tag_msg_One",  "Response email"+ s.getApiStatus());
                        Intent i = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
                        startActivity(i);
                    }

                    @Override
                    public void onFailure(Call<ForgetPasswordResponse> call, Throwable t) {
                        Toast.makeText(ForgetPasswordActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                        Log.d("Tag_msg_One",  "Response fail"+ t.getMessage());
                    }
                });

            }
        });

    }
}
