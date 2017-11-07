package com.wendy.bmi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    //匿名類別
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bhelp = (Button) findViewById(R.id.b_help);
        bhelp.setOnClickListener(listener);
        //getResources().getString(R.string.app_name);
    }
    public void bmi(View view){
//        System.out.println("What???");
        Log.d("MainActivity", "testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height * height);
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is)+ bmi)
                .setTitle(R.string.my_title)
                .setPositiveButton(R.string.ok, null)
                .show();

        //Log.d("MainActivity", "Your BMI is "+bmi);
    }
}
