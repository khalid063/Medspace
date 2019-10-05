package com.example.medspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.medspace.Fragments.HomeActivity;
import com.example.medspace.R;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageViewNotificaionBackBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        imageViewNotificaionBackBut = findViewById(R.id.notification_back_button);
        imageViewNotificaionBackBut.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        if ( v.getId() == R.id.notification_back_button){

            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);

        }
    }
}
