package com.example.meabid.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int a1=0,a2=0;

    public void reset(View view){
        a1=0;a2=0;
        resetForTeamA(a1);
        resetForTeamB(a2);
    }

    public void threeA(View view){
        a1+=3;
        displayForTeamA(a1);

    }
    public void twoA(View view){
        a1+=2;
        displayForTeamA(a1);

    }
    public void oneA(View view){
        a1++;
        displayForTeamA(a1);

    }


    public void threeB(View view){
        a2+=3;
        displayForTeamB(a2);

    }
    public void twoB(View view){
        a2+=2;
        displayForTeamB(a2);

    }
    public void oneB(View view){
        a2++;
        displayForTeamB(a2);

    }


    private void displayForTeamA(int number) {
        TextView score = (TextView) findViewById(R.id.scoreA_text_view);
        score.setText("" + number);
    }
    private void displayForTeamB(int number) {
        TextView score = (TextView) findViewById(R.id.scoreB_text_view);
        score.setText("" + number);
    }

    private void resetForTeamA(int number) {
        TextView score = (TextView) findViewById(R.id.scoreA_text_view);
        score.setText("" + number);
    }

    private void resetForTeamB(int number) {
        TextView score = (TextView) findViewById(R.id.scoreB_text_view);
        score.setText("" + number);
    }

}
