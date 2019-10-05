package com.example.medspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.medspace.Model.Details;
import com.example.medspace.Model.GetUserDataResponse;
import com.example.medspace.Model.SignInResponse;
import com.example.medspace.Model.UserData;
import com.example.medspace.R;
import com.example.medspace.Retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProfileActivity extends AppCompatActivity {

    private TextView etProfileName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etProfileName = findViewById(R.id.profilePageRLTwo_text_1);

        UserData userData = new UserData();
        String userId = userData.getUserId();

        Details details = new Details();
        String followrs = details.getFollowingCount();

        GetUserDataResponse getUserDataResponse = new GetUserDataResponse();
        UserData userData1 = getUserDataResponse.getUserData();

        Log.d("Tag_msg_One", "parems " + userId);


        Call<GetUserDataResponse> call = RetrofitClient
                .getInstance()
                .getApi()
                .getUserData( "4358cd151d116939800592f71de56335", userId, followrs );

        call.enqueue(new Callback<GetUserDataResponse>() {
            @Override
            public void onResponse(Call<GetUserDataResponse> call, Response<GetUserDataResponse> response) {
                GetUserDataResponse s = response.body();
                //String userName = s.getUserData().getName();
                Log.d("Tag_msg_One",  "Response userName"+ s.getApiStatus());

                //Log.d("Tag_msg_One",  "Response name"+ s.getUserData().getUserId());

//                UserData userData = new UserData();
//                String userName = userData.getName();
                //etProfileName.setText(userName);
            }

            @Override
            public void onFailure(Call<GetUserDataResponse> call, Throwable t) {

            }
        });


    }
}
