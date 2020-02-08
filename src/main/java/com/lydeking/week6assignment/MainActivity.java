package com.lydeking.week6assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Intent homeIntent;
    Intent aboutIntent;
    Intent productIntent;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch)findViewById(R.id.switch1);
        homeIntent = new Intent(MainActivity.this, MainActivity.class);
        aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        productIntent = new Intent(MainActivity.this, ProductActivity.class);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return true;
    }



    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent homeIntent = new Intent(MainActivity.this, MainActivity.class);
        Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
        Intent productIntent = new Intent(MainActivity.this, ProductActivity.class);

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


    public void darkmodeCheck(View view){

        ConstraintLayout background = (ConstraintLayout)findViewById(R.id.constraintLayout);

        if(switch1.isChecked()){

            background.setBackgroundColor(Color.parseColor("#6B6E6F"));
        } else if (!switch1.isChecked()){
            background.setBackgroundColor(Color.parseColor("#92BDF7"));
        }

    }
}