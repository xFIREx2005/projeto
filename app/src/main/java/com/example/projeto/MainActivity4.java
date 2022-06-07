package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);
    }

    public void Esc1(View view){
        Intent it = new Intent(this, MainActivity5.class);
        startActivity(it);
    }
    public void Esc2(View view){
        Intent it = new Intent(this, MainActivity6.class);
        startActivity(it);
    }
}