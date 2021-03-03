package com.example.lopena_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.display);

        int birthMonth = 4;
        int birthDay = 23;
        int birthYear = 2002;

        int currentMonth = 3;
        int currentDay = 2;
        int currentYear = 2021;

        int myageinmonths, myageindays, myageinyears;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }


        if(birthDay > currentDay){
            currentDay += 31;
            currentMonth -= 1;
        }


        myageinmonths = currentMonth - birthMonth;
        myageindays = currentDay - birthDay;
        myageinyears = currentYear - birthYear;


        display.setText("My precise age is\n"+String.valueOf(myageinyears)+" Years,\n"+String.valueOf(myageinmonths)+" Months,\n"+String.valueOf(myageindays)+" Days.");

    }
}
