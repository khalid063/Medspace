package com.example.medspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medspace.Activities.RegistrationActivityTwo;
import com.example.medspace.Model.CreatUserResponse;
import com.example.medspace.Model.SignInResponse;
import com.example.medspace.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView imageViewSigninBut;
    private TextView textViewDontHaveAnyAccountBut;

    private EditText etUserName, etPserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        imageViewSigninBut = findViewById(R.id.signinNextButtonId);
        textViewDontHaveAnyAccountBut = findViewById(R.id.dontHaveAnyAccount);

        etUserName = findViewById(R.id.userName);
        etPserPassword = findViewById(R.id.password);

        imageViewSigninBut.setOnClickListener(this);
        textViewDontHaveAnyAccountBut.setOnClickListener(this);



//        textViewDontHaveAnyAccount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(LoginActivity.this,
//                        HomeActivity.class);
//                startActivity(i);
//                Toast.makeText(LoginActivity.this, "Registration Page", Toast.LENGTH_SHORT).show();
//
//            }
//        });


//        imageViewSigninBut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                EditText username = (EditText)findViewById(R.id.userName);
//                EditText password = (EditText)findViewById(R.id.password);
//
//                if (username.getText().toString().equals("admin") &&
//                        password.getText().toString().equals("12345")){
//
//                    Intent i = new Intent(LoginActivity.this,
//                            MainActivity.class);
//                    startActivity(i);
//                }else {
//                    Toast.makeText(LoginActivity.this, "Wrong Pass", Toast.LENGTH_SHORT).show();
//                }
//
//
//
//            }
//        });



    }


    @Override
    public void onClick(View v) {

        userLogin(etUserName.getText().toString(), etPserPassword.getText().toString());

//        if (v.getId() == R.id.signinNextButtonId){
//
//                EditText username = (EditText)findViewById(R.id.userName);
//                EditText password = (EditText)findViewById(R.id.password);
//
//                if (username.getText().toString().equals("admin") &&
//                        password.getText().toString().equals("12345")){
//
//                    Intent i = new Intent(LoginActivity.this,
//                            MainActivity.class);
//                    startActivity(i);
//                }else {
//                    Toast.makeText(LoginActivity.this, "Wrong Pass", Toast.LENGTH_SHORT).show();
//                }
//        }
//        else if (v.getId() == R.id.dontHaveAnyAccount){
//            Intent i = new Intent(LoginActivity.this,
//                    RegistrationActivityTwo.class);
//            startActivity(i);
//        }


    }

    private void userLogin(final String userName, String password) {

        Call<SignInResponse> call = RetrofitClient
                .getInstance()
                .getApi()
                .userLogin("4358cd151d116939800592f71de56335",userName, password);

        call.enqueue(new Callback<SignInResponse>() {
            @Override
            public void onResponse(Call<SignInResponse> call, Response<SignInResponse> response) {

                SignInResponse s = response.body();
                Toast.makeText(LoginActivity.this, s.getUserId(), Toast.LENGTH_SHORT).show();
                Log.d("Tag_msg",  "Response "+ s.getUserId());

                int userStatus = s.getApiStatus();

                if (userStatus == 200){
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(LoginActivity.this, "Something goes wrong", Toast.LENGTH_LONG).show();
                }



            }

            @Override
            public void onFailure(Call<SignInResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });



//        Intent i = new Intent(LoginActivity.this,
//                            MainActivity.class);
//                    startActivity(i);

    }
}
