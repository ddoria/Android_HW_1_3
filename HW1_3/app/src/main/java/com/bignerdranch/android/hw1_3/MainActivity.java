package com.bignerdranch.android.hw1_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button mRedButton;
    private Button mGreenButton;
    private Button mBlueButton;

    private LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRedButton = (Button) findViewById(R.id.red_button);
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLayout = (LinearLayout) findViewById(R.id.mLayout);
                mLayout.setBackgroundColor(Color.rgb(255,0,0));
            }
        });

        mGreenButton = (Button) findViewById(R.id.green_button);
        mGreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLayout = (LinearLayout) findViewById(R.id.mLayout);
                mLayout.setBackgroundColor(Color.rgb(0,255,0));
            }
        });

        mBlueButton = (Button) findViewById(R.id.blue_button);
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLayout = (LinearLayout) findViewById(R.id.mLayout);
                mLayout.setBackgroundColor(Color.rgb(0,0,255));
            }
        });
    }
}
