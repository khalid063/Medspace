package com.example.medspace.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.medspace.R;


public class NotificationFragment extends Fragment implements View.OnClickListener {

    private ImageView imageViewNotificaionBackBut;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification,
                container, false);

        imageViewNotificaionBackBut = view.findViewById(R.id.notification_back_button);
        imageViewNotificaionBackBut.setOnClickListener(this);


        return view;
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.notification_back_button){

            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                    new HomeActivity()).commit();

        }

    }
}
