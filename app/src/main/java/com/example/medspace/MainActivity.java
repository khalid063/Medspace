package com.example.medspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.medspace.Fragments.HomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                new HomeActivity()).commit();





    }
}
