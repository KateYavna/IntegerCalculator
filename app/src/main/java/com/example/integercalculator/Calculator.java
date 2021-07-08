package com.example.integercalculator;

import android.util.Log;

public class Calculator {
    public int object1;
    public int object2;
    public double resultdouble;
    public int resultint;
    public String poweron;
    public String poweroff;

    Calculator (int object1, int object2){
        this.object1 = object1;
        this.object2 = object2;
    }
    void add (){
        resultint = object1 + object2;
        Log.d("MyLog", String.valueOf(object1) + " + " + object2 + " = " + resultint );
    }
    void sub (){
        resultint = object1 - object2;
        Log.d("MyLog", String.valueOf(object1) + " - " + object2 + " = " + resultint );
    }
    void mult (){
        resultint = object1 * object2;
        Log.d("MyLog", String.valueOf(object1) + " * " + object2 + " = " + resultint );
    }
    void div (){
        int rem = object1 % object2;
        if ((rem==0)&&(object1>=object2)) {
            resultint = object1 / object2;
            Log.d("MyLog", String.valueOf(object1) + " / " + object2 + " = " + resultint);
        }
        else {
            double doubleobject1 = object1;
            double doubleobject2 = object2;
            resultdouble = doubleobject1 / doubleobject2;
            Log.d("MyLog", String.valueOf(object1) + " / " + object2 + " = " + resultdouble);
        }
    }
    String swichOn (String poweron){
        this.poweron = poweron;
        if (poweron.equals("swich on")) {
            return "Calculator swiched on";
        }
        else return "Calculator swiched off";
    }
    String swichOff (String poweroff){
        this.poweroff =poweroff;
        if (poweroff.equals("swich off"));
        {
            return "Calculator swiched off";
        }
    }
}
