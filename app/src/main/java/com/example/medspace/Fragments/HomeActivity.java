package com.example.medspace.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.medspace.Activities.NotificationActivity;
import com.example.medspace.Activities.ProfileActivity;
import com.example.medspace.LoginActivity;
import com.example.medspace.MainActivity;
import com.example.medspace.Model.SignInResponse;
import com.example.medspace.R;
import com.example.medspace.Retrofit.RetrofitClient;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeActivity extends Fragment implements View.OnClickListener {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);






        return view;
    }



    @Override
    public void onClick(View v) {



    }
}
