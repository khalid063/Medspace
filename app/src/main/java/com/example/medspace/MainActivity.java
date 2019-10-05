package com.example.medspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medspace.Activities.NotificationActivity;
import com.example.medspace.Activities.ProfileActivity;
import com.example.medspace.Fragments.ChatFragment;
import com.example.medspace.Fragments.DiscassionFragment;
import com.example.medspace.Fragments.HomeActivity;
import com.example.medspace.Fragments.LibraryFragment;
import com.example.medspace.Fragments.NotificationFragment;
import com.example.medspace.Fragments.SearchFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout linearLayoutHomeBut, linearLayoutSearchBut, linearLayoutdiscasBut,
            linearLayoutChatBut, linearLayoutLibBut;

    private ImageView imageViewSearchBut, imageViewDiscassionBut, imageViewHomeBut,
            imageViewChatBut, imageViewLibraryBut, imageViewProfileBut,
            imageViewNotificationBut;

    private TextView textViewTitleOfHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                new HomeActivity()).commit();

        // for icon color change
        ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
        imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

        linearLayoutHomeBut = findViewById(R.id.homeButId);
        linearLayoutSearchBut = findViewById(R.id.searchButId);
        linearLayoutdiscasBut = findViewById(R.id.discasionhButId);
        linearLayoutChatBut = findViewById(R.id.chatButId);
        linearLayoutLibBut = findViewById(R.id.libraryButId);

        imageViewHomeBut = findViewById(R.id.homeImageViewIcon);
        imageViewSearchBut = findViewById(R.id.searchImageViewIcon);
        imageViewDiscassionBut = findViewById(R.id.discassionImageViewIcon);
        imageViewChatBut = findViewById(R.id.chatImageViewIcon);
        imageViewLibraryBut = findViewById(R.id.libraryImageViewIcon);

        imageViewProfileBut = findViewById(R.id.profileIconBut);
        // home Notification button
        imageViewNotificationBut = findViewById(R.id.home_toolbar_notificaion_icon);





        // Listener set
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

         //profile but for go profile activity
        imageViewProfileBut.setOnClickListener(this);
         //home Notification button
        imageViewNotificationBut.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

            // discassion but of bottom_nav_toolbar
            if (v.getId() == R.id.discassionImageViewIcon){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new DiscassionFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.discassionImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Discassion");

            }else if (v.getId() == R.id.discasionhButId){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new DiscassionFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.discassionImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Discassion");
            }

         //    Home but of bottom_nav_toolbar
        else if (v.getId() == R.id.homeImageViewIcon){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer_home, new HomeActivity()).commit();
            // for icon color change
            ImageView  imageViewDiscussIcon = findViewById(R.id.homeImageViewIcon);
            imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

            ImageView  imageViewHomeIcon = findViewById(R.id.discassionImageViewIcon);
            imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

            // title change
            textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
            textViewTitleOfHome.setText("Home");

        }else if (v.getId() == R.id.homeButId){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer_home, new HomeActivity()).commit();
            // for icon color change
            ImageView  imageViewDiscussIcon = findViewById(R.id.homeImageViewIcon);
            imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

            ImageView  imageViewHomeIcon = findViewById(R.id.discassionImageViewIcon);
            imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

            // title change
            textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
            textViewTitleOfHome.setText("Home");
        }

            //    Chat but of bottom_nav_toolbar
            else if (v.getId() == R.id.chatImageViewIcon){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new ChatFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.chatImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Chat");

            }else if (v.getId() == R.id.chatButId){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new ChatFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.discassionImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Chat");
            }


            //    Library but of bottom_nav_toolbar
            else if (v.getId() == R.id.libraryImageViewIcon){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new LibraryFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.chatImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Library");

            }else if (v.getId() == R.id.libraryButId){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new LibraryFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.discassionImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Library");
            }


            //    Search but of bottom_nav_toolbar
            else if (v.getId() == R.id.searchImageViewIcon){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new SearchFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.chatImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Search");

            }else if (v.getId() == R.id.searchButId){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer_home, new SearchFragment()).commit();
                // for icon color change
                ImageView  imageViewDiscussIcon = findViewById(R.id.discassionImageViewIcon);
                imageViewDiscussIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
                imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  chatImageIcon = findViewById(R.id.chatImageViewIcon);
                chatImageIcon.setColorFilter(getResources().getColor(R.color.transparent));

                ImageView  imageViewSearchIcon = findViewById(R.id.searchImageViewIcon);
                imageViewSearchIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

                ImageView  imageViewLibraryIcon = findViewById(R.id.libraryImageViewIcon);
                imageViewLibraryIcon.setColorFilter(getResources().getColor(R.color.transparent));

                // title change
                textViewTitleOfHome = findViewById(R.id.title_of_toolbr);
                textViewTitleOfHome.setText("Search");
            }


        // for go profile activity
        else if ( v.getId() == R.id.profileIconBut){
//            Intent i = new Intent(getActivity(), ProfileActivity.class);
//            startActivity(i);
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
        }
        // for go home to notification  activity
        else if ( v.getId() == R.id.home_toolbar_notificaion_icon){

                Intent i = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(i);

            }
//            Intent i = new Intent(getActivity(), NotificationActivity.class);
//            startActivity(i);


//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new NotificationFragment()).commit();



//        if ( v.getId() == R.id.homeButId){
////            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
////                    new HomeActivity()).commit();
//
//            getFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer_home, new HomeActivity()).commit();
//
//        }else if ( v.getId() == R.id.homeImageViewIcon){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new HomeActivity()).commit();
//        }
//
//        else if ( v.getId() == R.id.searchButId){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new SearchFragment()).commit();
//        }else if ( v.getId() == R.id.searchImageViewIcon){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new SearchFragment()).commit();
//        }
//
//        else if ( v.getId() == R.id.discasionhButId){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new DiscassionFragment()).commit();
//        }else if ( v.getId() == R.id.discassionImageViewIcon){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new DiscassionFragment()).commit();
//        }
//
//        else if ( v.getId() == R.id.chatButId){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new ChatFragment()).commit();
//        }else if ( v.getId() == R.id.chatImageViewIcon){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new ChatFragment()).commit();
//        }
//
//        else if ( v.getId() == R.id.libraryButId){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new LibraryFragment()).commit();
//        }else if ( v.getId() == R.id.libraryImageViewIcon){
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new LibraryFragment()).commit();
//        }
//
//        // for go profile activity
//        else if ( v.getId() == R.id.profileIconBut){
//            Intent i = new Intent(MainActivity.this, ProfileActivity.class);
//            startActivity(i);
//        }
//
//        // for go home to notification  activity
//        else if ( v.getId() == R.id.home_toolbar_notificaion_icon){
//
//            getFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
//                    new NotificationFragment()).commit();
//
//
//        }


    }
}
