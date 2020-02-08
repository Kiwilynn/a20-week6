package com.lydeking.week6assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;

public class ProductActivity extends AppCompatActivity {

    Intent homeIntent;
    Intent aboutIntent;
    Intent productIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        homeIntent = new Intent(ProductActivity.this, MainActivity.class);
        aboutIntent = new Intent(ProductActivity.this, AboutActivity.class);
        productIntent= new Intent(ProductActivity.this, ProductActivity.class);
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
