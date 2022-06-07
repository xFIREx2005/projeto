package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void endEmp(View view){
        String strUri = "http://maps.google.com/maps?q=loc:37.422388,-122.0841883";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse(strUri));

        intent.setClassName("com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity");
        startActivity(intent);
    }
    public void siteEmp(View view){
        String url = "https://www.microsoft.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void redeEmp(View view){
        String url = "https://www.instagram.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void back(View view){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}