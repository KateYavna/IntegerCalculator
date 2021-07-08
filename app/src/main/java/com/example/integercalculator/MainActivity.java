package com.example.integercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculator calculator1 = new Calculator(3,2);
        String on = calculator1.swichOn("swich on");
        if (on.equals("Calculator swiched on")) {
            Log.d("MyLog", on );
            calculator1.add();
            calculator1.sub();
            calculator1.mult();
            calculator1.div();
            String off = calculator1.swichOff("swich off");
            Log.d("MyLog", off );
        }
        else   Log.d("MyLog", "You missed to swich on calculator" );
    }
}