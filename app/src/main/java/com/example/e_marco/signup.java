package com.example.e_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void nextdetails(View view) {
        Intent shopdetails = new Intent(signup.this, shopDetails.class);
        startActivity(shopdetails);
    }
}
