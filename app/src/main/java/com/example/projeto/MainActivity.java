package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void play(View view){
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
    public void who(View view){
        Intent it = new Intent(this, MainActivity2.class);
        startActivity(it);
    }
    public void emp(View view){
        Intent it = new Intent(this, MainActivity8.class);
        startActivity(it);
    }


}