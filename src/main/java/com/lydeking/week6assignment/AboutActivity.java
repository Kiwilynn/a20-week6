package com.lydeking.week6assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class AboutActivity extends AppCompatActivity {

    Intent homeIntent;
    Intent productIntent;
    Intent aboutIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        homeIntent = new Intent(AboutActivity.this, MainActivity.class);
        productIntent = new Intent(AboutActivity.this, ProductActivity.class);
        aboutIntent = new Intent(AboutActivity.this, AboutActivity.class);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }



    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        int id = item.getItemId();

        if (id == R.id.About){

            startActivity(aboutIntent);
            return true;
        } else if (id == R.id.Product){
            startActivity(productIntent);
        } else if (id == R.id.Home){
            startActivity(homeIntent);
        }

        return super.onOptionsItemSelected(item);

    }
}
