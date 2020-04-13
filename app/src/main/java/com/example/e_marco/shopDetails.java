package com.example.e_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shopDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);
    }

    public void intohome(View view) {
        Intent intohome = new Intent(shopDetails.this, home.class);
        startActivity(intohome);
    }
}
