package com.voshodnerd.excellexporter;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.voshodnerd.excellexporter.fragment.FirstPageFragment;
import com.voshodnerd.excellexporter.fragment.MainFragment;
import com.voshodnerd.excellexporter.fragment.SecondPageFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawerLayout = findViewById(R.id.drawer_layout);


        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, getFragment())
                    .commit();
        }




        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        drawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        switch (menuItem.getItemId()) {
                            case R.id.nav_camera: {
                                getSupportFragmentManager()
                                        .beginTransaction()
                                        .replace(R.id.content_frame, FirstPageFragment.newInstance())
                                        .commit();
                                break;
                            }
                            case R.id.nav_gallery: {
                                getSupportFragmentManager()
                                        .beginTransaction()
                                        .replace(R.id.content_frame, SecondPageFragment.newInstance())
                                        .commit();
                                break;
                            }
                            default:{break;}

                        }
                        return true;
                    }
                });
    }


    protected Fragment getFragment() {
        return MainFragment.newInstance();
    }


}
