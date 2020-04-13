package com.example.e_marco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signuppage(View view) {
        Intent intosignup = new Intent(MainActivity.this, signup.class);
        startActivity(intosignup);
    }

    public void gotohome(View view) {
        Intent homepage = new Intent(MainActivity.this, home.class);
        startActivity(homepage);
    }
}
