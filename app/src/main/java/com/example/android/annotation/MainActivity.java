package com.example.android.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Default("hello world")
    private String text;

    @Default("12")
    public int number;

    @Default("3.14159268")
    float decimal;

    @Default("6544554335353531")
    long aLong;

    @Default("bad value")
    Double aDouble;

    @Default("1.55")
    double dobl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAnnotation.inject(this);

        Log.v("myLogs", text + " - " + decimal + " - " + number + " - " + aLong + " - " + dobl + " - " + aDouble);
    }
}
