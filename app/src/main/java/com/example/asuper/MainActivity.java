package com.example.asuper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView BottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigation = (BottomNavigationView)findViewById(R.id.nav_bottom);


        //noinspection deprecation
        BottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fram = null;
                switch(item.getItemId())
                {
                    case R.id.Room_menu :
                        fram = new room();
                        break;
                    case R.id.winner_menu :
                        fram = new Winner();
                        break;
                    case R.id.admin_menu :
                        fram = new admin();
                        break;
                    case R.id.diamond_menu :
                        fram = new diamond();
                        break;
                    
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.main_fram,fram).commit();
                return true;
            }
        });
        BottomNavigation.setSelectedItemId(R.id.Room_menu);

    }
}