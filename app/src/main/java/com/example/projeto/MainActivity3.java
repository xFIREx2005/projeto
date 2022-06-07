package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
    }
    public int numTxt = 0;
    public void ChooseTxt(View view){
        TextView txt = (TextView) findViewById(R.id.txthis);
        String his_na1 = getString(R.string.his_na1);
        numTxt++;
        if(numTxt == 1)
        {
            txt.setText(his_na1);
        }
        if(numTxt >= 2)
        {
            Intent it = new Intent(this, MainActivity4.class);
            startActivity(it);
        }
    }



}