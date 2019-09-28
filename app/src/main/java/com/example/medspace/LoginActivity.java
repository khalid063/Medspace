package com.example.medspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewSigninBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        imageViewSigninBut = findViewById(R.id.signinNextButtonId);


        imageViewSigninBut.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if ( v.getId() == R.id.signinNextButtonId){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}
