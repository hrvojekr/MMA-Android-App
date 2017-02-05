package com.example.android.mmaapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int rCorner = 0;
    int bCorner = 0;
    int rTStrikes = 0;
    int bTStrikes = 0;
    int rSSTrikes = 0;
    int bSSTrikes = 0;
    int rTakedowns = 0;
    int bTakedowns = 0;
    int rSAttempts = 0;
    int bSAttempts = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Red Corner wins round

    public void roundWonR(View view) {
        rCorner = rCorner + 1;
        if (rCorner + bCorner > 5) {
            Toast.makeText(this, "There is maximum of five rounds", Toast.LENGTH_SHORT).show();
            return;
        }

        displayRoundRed(rCorner);

    }

    // Blue corner wins round

    public void roundWonB(View view) {
        bCorner = bCorner + 1;
        if (bCorner + rCorner > 5) {
            Toast.makeText(this, "There is maximum of five rounds", Toast.LENGTH_SHORT).show();
            return;
        }

        displayRoundBlue(bCorner);

    }
    //Add total strikes to Red corner

    public void totalStrikesR(View view) {
        rTStrikes = rTStrikes + 1;
        displayTotalStrikesR(rTStrikes);
    }

    // Add total strikes to Blue corner

    public void totalStirkesB(View view) {
        bTStrikes = bTStrikes + 1;
        displayTotalStrikesB(bTStrikes);
    }

    //Add signif. strikes to Red Corner

    public void sigStrikesR(View view) {
        rSSTrikes = rSSTrikes + 1;
        displaySigStrikesR(rSSTrikes);
        rTStrikes = rTStrikes + 1;
        displayTotalStrikesR(rTStrikes);
    }

    //Add signif. strikes to Blue Corner

    public void sigStrikesB(View view) {
        bSSTrikes = bSSTrikes + 1;
        displaySigStrikesB(bSSTrikes);
        bTStrikes = bTStrikes + 1;
        displayTotalStrikesB(bTStrikes);
    }

    //Add takedown to Red Corner

    public void takedownsR(View view) {
        rTakedowns = rTakedowns + 1;
        displayTakedownsR(rTakedowns);
    }

    //Add takedown to Blue Corner

    public void takedownsB(View view) {
        bTakedowns = bTakedowns + 1;
        displayTakedownsB(bTakedowns);
    }

    //Add sub.attempts to Red Corner

    public void submissionAttemptsR(View view) {
        rSAttempts = rSAttempts + 1;
        displaySubAttemptsR(rSAttempts);
    }

    //Add sub.attempts to Blue Corner

    public void submissionAttemptsBlue(View view) {
        bSAttempts = bSAttempts + 1;
        displaySubAttemptsB(bSAttempts);
    }

    // Reset to new fight.

    public void newFight(View view) {
        rCorner = 0;
        bCorner = 0;
        rTStrikes = 0;
        bTStrikes = 0;
        rSSTrikes = 0;
        bSSTrikes = 0;
        rTakedowns = 0;
        bTakedowns = 0;
        rSAttempts = 0;
        bSAttempts = 0;
        displayRoundRed(rCorner);
        displayRoundBlue(bCorner);
        displayTotalStrikesR(rTStrikes);
        displayTotalStrikesB(bTStrikes);
        displaySigStrikesR(rSSTrikes);
        displaySigStrikesB(bSSTrikes);
        displayTakedownsR(rTakedowns);
        displayTakedownsB(bTakedowns);
        displaySubAttemptsR(rSAttempts);
        displaySubAttemptsB(bSAttempts);

    }


    // Get and display round Red

    public void displayRoundRed(int score) {
        TextView roundView = (TextView) findViewById(R.id.red_score);
        roundView.setText(String.valueOf(score));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarRoundsR);
        progressBar.setProgress(score);

        //oolor of ProgressBar
        progressBar.getProgressDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    //Get and display round Blue

    public void displayRoundBlue(int score) {
        TextView roundView = (TextView) findViewById(R.id.blue_score);
        roundView.setText(String.valueOf(score));
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarRoundsB);
        progressBar.setProgress(score);

        //oolor of ProgressBar
        progressBar.getProgressDrawable().setColorFilter(
                Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
    }


    // Get and display total strikes Red

    public void displayTotalStrikesR(int score) {
        TextView roundView = (TextView) findViewById(R.id.totalStirkeRed);
        roundView.setText(String.valueOf(score));
    }


    //Get and display total stirkes Blue

    public void displayTotalStrikesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalStikesBlue);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display Significant Strikes Red

    public void displaySigStrikesR(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sigStriksR);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display Significant Strikes Blue

    public void displaySigStrikesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sigStrikesB);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display Significant Strikes Red

    public void displayTakedownsR(int score) {
        TextView scoreView = (TextView) findViewById(R.id.takedownsRed);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display Significant Strikes Blue

    public void displayTakedownsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.takedownsBlue);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display Submission Attempts Red

    public void displaySubAttemptsR(int score) {
        TextView scoreView = (TextView) findViewById(R.id.subAttempR);
        scoreView.setText(String.valueOf(score));
    }

    //Get and display SubmissionAttempts Blue

    public void displaySubAttemptsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.subAttemptsB);
        scoreView.setText(String.valueOf(score));
    }

}