package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threepointer(View view){
        score=score+3;
        display(score);
    }
    public void twopointer(View view){
        score=score+2;
        display(score);
    }
    public void freethrow(View view){
        score=score+1;
        display(score);
    }
    public void threepointer2(View view){
        score=score+3;
        display2(score);
    }
    public void twopointer2(View view){
        score=score+2;
        display2(score);
    }
    public void freethrow2(View view){
        score=score+1;
        display2(score);
    }
    public void Reset(View view){
        score=0;
        display(score);
        display2(score);
    }



    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score_text_view);
        scoreTextView.setText("" + number);
    }
    private void display2(int number) {
        TextView score2TextView = (TextView) findViewById(R.id.score2_text_view);
        score2TextView.setText("" + number);
    }
}