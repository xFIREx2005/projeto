package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main6);
    }
    public int numTxt;
    public void ChooseTxt(View view){
        TextView txt = (TextView) findViewById(R.id.txthis);
        String his_fa2_2 = getString(R.string.his_fa2_2);
        String his_fa3_2 = getString(R.string.his_fa3_2);
        String his_fa4_2 = getString(R.string.his_fa4_2);
        String his_fa5_2 = getString(R.string.his_fa5_2);
        String his_fa6_2 = getString(R.string.his_fa6_2);
        String his_fa7_2 = getString(R.string.his_fa7_2);
        String his_na1_2 = getString(R.string.his_na4_2);
        String his_na2_2 = getString(R.string.his_na5_2);
        String his_na3_2 = getString(R.string.his_na6_2);
        numTxt++;
        if(numTxt == 1) {txt.setText(his_fa2_2);}
        if(numTxt == 2) {txt.setText(his_fa3_2);}
        if(numTxt == 3) {txt.setText(his_fa4_2);}
        if(numTxt == 4) {txt.setText(his_fa5_2);}
        if(numTxt == 5) {txt.setText(his_fa6_2);}
        if(numTxt == 6) {txt.setText(his_fa7_2);}
        if(numTxt == 7) {txt.setText(his_na1_2);}
        if(numTxt == 8) {txt.setText(his_na2_2);}
        if(numTxt == 9) {txt.setText(his_na3_2);}
        if(numTxt >= 10)
        {
            Intent it = new Intent(this, MainActivity7.class);
            startActivity(it);
        }
    }
}