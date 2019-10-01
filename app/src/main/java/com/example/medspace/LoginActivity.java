package com.example.medspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medspace.Activities.ProfileActivity;
import com.example.medspace.Activities.RegistrationActivity;
import com.example.medspace.Activities.RegistrationActivityTwo;
import com.example.medspace.Fragments.HomeActivity;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView imageViewSigninBut;
    private TextView textViewDontHaveAnyAccountBut;

    private EditText userName, userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        imageViewSigninBut = findViewById(R.id.signinNextButtonId);
        textViewDontHaveAnyAccountBut = findViewById(R.id.dontHaveAnyAccount);

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

        if (v.getId() == R.id.signinNextButtonId){

                EditText username = (EditText)findViewById(R.id.userName);
                EditText password = (EditText)findViewById(R.id.password);

                if (username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("12345")){

                    Intent i = new Intent(LoginActivity.this,
                            MainActivity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(LoginActivity.this, "Wrong Pass", Toast.LENGTH_SHORT).show();
                }
        }
        else if (v.getId() == R.id.dontHaveAnyAccount){
            Intent i = new Intent(LoginActivity.this,
                    RegistrationActivityTwo.class);
            startActivity(i);
        }


    }
}
