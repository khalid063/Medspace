package com.example.medspace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medspace.Activities.CreatGroupActivity;
import com.example.medspace.Activities.NotificationActivity;
import com.example.medspace.Activities.ProfileActivity;
import com.example.medspace.Fragments.ChatFragment;
import com.example.medspace.Fragments.CreatGroupFragment;
import com.example.medspace.Fragments.DiscassionFragment;
import com.example.medspace.Fragments.HomeActivity;
import com.example.medspace.Fragments.LibraryFragment;
import com.example.medspace.Fragments.NotificationFragment;
import com.example.medspace.Fragments.SearchFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener{

    private static final String TAG = "MainActivity";

    private LinearLayout linearLayoutHomeBut, linearLayoutSearchBut, linearLayoutdiscasBut,
            linearLayoutChatBut, linearLayoutLibBut;

    private ImageView imageViewSearchBut, imageViewDiscassionBut, imageViewHomeBut,
            imageViewChatBut, imageViewLibraryBut, imageViewProfileBut,
            imageViewNotificationBut;

    private TextView textViewTitleOfHome;



    // for Drawar Navigation menu
    RelativeLayout rlDrawarButtton;
    DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer_home,
                new HomeActivity()).commit();

        // for icon color change
        ImageView  imageViewHomeIcon = findViewById(R.id.homeImageViewIcon);
        imageViewHomeIcon.setColorFilter(getResources().getColor(R.color.toolbar_blue));

        // for Drawar Navigation menu
        rlDrawarButtton = findViewById (R.id.homeIcon);
        drawerLayout = findViewById (R.id.drawar_layout);
        navigationView = findViewById(R.id.nav_view_id);





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

        // for drawar menu
        rlDrawarButtton.setOnClickListener(this);
        navigationView.setNavigationItemSelectedListener(this);







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

        // For drawar navigation menu
        else if (v.getId() == R.id.homeIcon){

                drawerLayout.openDrawer(GravityCompat.START);



            }



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Log.d(TAG,"onNavigationItemSelected");

        switch(menuItem.getItemId()){
            case R.id.creat_group_id:
                Toast.makeText(MainActivity.this,"Home item click", Toast.LENGTH_LONG).show();
                break;
        }

        return true;

    }
    // For Drawar navigation item action
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        MenuInflater inflater = getMenuInflater();inflater.inflate(R.menu.drawer_nav_menu, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        super.onOptionsItemSelected(item);
//        switch(item.getItemId()){
//            case R.id.creat_group_id:
//                Toast.makeText(MainActivity.this,"Home item click", Toast.LENGTH_LONG).show();
//                return true;
//        }
//
//        return true;
//    }





}
