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

    private LinearLayout linearLayoutHomeBut, linearLayoutSearchBut, linearLayoutdiscasBut,
            linearLayoutChatBut, linearLayoutLibBut;

    private ImageView imageViewSearchBut, imageViewDiscassionBut, imageViewHomeBut,
                        imageViewChatBut, imageViewLibraryBut, imageViewProfileBut,
                        imageViewNotificationBut;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);



        // for icon color change
        ImageView  imageViewHomeIcon = view.findViewById(R.id.homeImageViewIcon);
        imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

        linearLayoutHomeBut = view.findViewById(R.id.homeButId);
        linearLayoutSearchBut = view.findViewById(R.id.searchButId);
        linearLayoutdiscasBut = view.findViewById(R.id.discasionhButId);
        linearLayoutChatBut = view.findViewById(R.id.chatButId);
        linearLayoutLibBut = view.findViewById(R.id.libraryButId);

        imageViewHomeBut = view.findViewById(R.id.homeImageViewIcon);
        imageViewSearchBut = view.findViewById(R.id.searchImageViewIcon);
        imageViewDiscassionBut = view.findViewById(R.id.discassionImageViewIcon);
        imageViewChatBut = view.findViewById(R.id.chatImageViewIcon);
        imageViewLibraryBut = view.findViewById(R.id.libraryImageViewIcon);

        imageViewProfileBut = view.findViewById(R.id.profileIconBut);
        // home Notification button
        imageViewNotificationBut = view.findViewById(R.id.home_toolbar_notificaion_icon);


        linearLayoutHomeBut.setOnClickListener(this);
        linearLayoutSearchBut.setOnClickListener(this);
        linearLayoutdiscasBut.setOnClickListener(this);
        linearLayoutChatBut.setOnClickListener(this);
        linearLayoutLibBut.setOnClickListener(this);

        imageViewHomeBut.setOnClickListener(this);
        imageViewSearchBut.setOnClickListener(this);
        imageViewDiscassionBut.setOnClickListener(this);
        imageViewChatBut.setOnClickListener(this);
        imageViewLibraryBut.setOnClickListener(this);

        // profile but for go profile activity
        imageViewProfileBut.setOnClickListener(this);
        // home Notification button
        imageViewNotificationBut.setOnClickListener(this);





        return view;
    }



    @Override
    public void onClick(View v) {

        if ( v.getId() == R.id.homeButId){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new HomeActivity()).commit();
        }else if ( v.getId() == R.id.homeImageViewIcon){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new HomeActivity()).commit();
        }

        else if ( v.getId() == R.id.searchButId){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new SearchFragment()).commit();
        }else if ( v.getId() == R.id.searchImageViewIcon){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new SearchFragment()).commit();
        }

        else if ( v.getId() == R.id.discasionhButId){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new DiscassionFragment()).commit();
        }else if ( v.getId() == R.id.discassionImageViewIcon){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new DiscassionFragment()).commit();
        }

        else if ( v.getId() == R.id.chatButId){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new ChatFragment()).commit();
        }else if ( v.getId() == R.id.chatImageViewIcon){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new ChatFragment()).commit();
        }

        else if ( v.getId() == R.id.libraryButId){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new LibraryFragment()).commit();
        }else if ( v.getId() == R.id.libraryImageViewIcon){
            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new LibraryFragment()).commit();
        }

        // for go profile activity
        else if ( v.getId() == R.id.profileIconBut){
            Intent i = new Intent(getActivity(), ProfileActivity.class);
            startActivity(i);
        }

        // for go home to notification  activity
        else if ( v.getId() == R.id.home_toolbar_notificaion_icon){

            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new NotificationFragment()).commit();


        }


    }
}
