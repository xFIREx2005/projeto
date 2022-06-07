package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main5);
    }
    public int numTxt;
    public void ChooseTxt(View view){
        TextView txt = (TextView) findViewById(R.id.txthis);
        String his_fa2_1 = getString(R.string.his_fa2_1);
        String his_fa3_1 = getString(R.string.his_fa3_1);
        String his_fa4_1 = getString(R.string.his_fa4_1);
        String his_fa5_1 = getString(R.string.his_fa5_1);
        String his_fa6_1 = getString(R.string.his_fa6_1);
        String his_fa7_1 = getString(R.string.his_fa7_1);
        String his_fa8_1 = getString(R.string.his_fa8_1);
        String his_fa9_1 = getString(R.string.his_fa9_1);
        String his_fa10_1 = getString(R.string.his_fa10_1);
        String his_fa11_1 = getString(R.string.his_fa11_1);
        String his_fa12_1 = getString(R.string.his_fa12_1);
        String his_fa13_1 = getString(R.string.his_fa13_1);
        String his_fa14_1 = getString(R.string.his_fa14_1);
        String his_fa15_1 = getString(R.string.his_fa15_1);
        String his_fa16_1 = getString(R.string.his_fa16_1);
        String his_na1_1 = getString(R.string.his_na4_1);
        numTxt++;
        if(numTxt == 1) {txt.setText(his_fa2_1);}
        if(numTxt == 2) {txt.setText(his_fa3_1);}
        if(numTxt == 3) {txt.setText(his_fa4_1);}
        if(numTxt == 4) {txt.setText(his_fa5_1);}
        if(numTxt == 5) {txt.setText(his_fa6_1);}
        if(numTxt == 6) {txt.setText(his_fa7_1);}
        if(numTxt == 7) {txt.setText(his_fa8_1);}
        if(numTxt == 8) {txt.setText(his_fa9_1);}
        if(numTxt == 9) {txt.setText(his_fa10_1);}
        if(numTxt == 10) {txt.setText(his_fa11_1);}
        if(numTxt == 11) {txt.setText(his_fa12_1);}
        if(numTxt == 12) {txt.setText(his_fa13_1);}
        if(numTxt == 13) {txt.setText(his_fa14_1);}
        if(numTxt == 14) {txt.setText(his_fa15_1);}
        if(numTxt == 15) {txt.setText(his_fa16_1);}
        if(numTxt == 16) {txt.setText(his_na1_1);}
        if(numTxt >= 17)
        {
            Intent it = new Intent(this, MainActivity7.class);
            startActivity(it);
        }
    }
}