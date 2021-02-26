package com.example.android.eventcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void display(int score) {
        TextView scoreView = (TextView) findViewById(R.id.count);
        String formattedStr = String.format("%04d", score);
        scoreView.setText(formattedStr);

       // String formattedStr = String.format("%03d", val); {
            //TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            //scoreView.setText(String.valueOf(score));
        //}
    }

    public void add(View v) {
        score = score + 1;
        display(score);

    }

    public void reset(View v) {
        score = 0;
        display(score);

    }




}




