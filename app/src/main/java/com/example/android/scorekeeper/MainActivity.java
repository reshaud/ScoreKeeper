package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Global Veriables Team A
    int goalTeamA = 0;
    int foulTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;

    //Global Varibales Team B
    int goalTeamB = 0;
    int foulTeamB = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //**********************************************************************************************
    //Team A functions

    //Display Team A Score
    private void DisplayTeamAGoal() {
        TextView display = (TextView) findViewById(R.id.teamAScore);
        display.setText(String.valueOf(goalTeamA));
    }

    //Display Team A Fouls
    private void DisplayTeamAFoul() {
        TextView display = (TextView) findViewById(R.id.foulTeamA);
        display.setText(String.valueOf(foulTeamA));
    }

    //Display Team A Yellow Cards
    private void DisplayTeamAYCard() {
        TextView display = (TextView) findViewById(R.id.yellowCardTeamA);
        display.setText(String.valueOf(yellowCardTeamA));
    }

    //Display Team A Red Cards
    private void DisplayTeamARCard() {
        TextView display = (TextView) findViewById(R.id.redCardTeamA);
        display.setText(String.valueOf(redCardTeamA));
    }

    //onClick methods*****************************************************

    public void TeamAGoal(View v) {
        //Increment goal counter
        goalTeamA++;

        //Display current goal count
        DisplayTeamAGoal();
    }

    public void TeamAFoul(View v) {
        //Increment foul counter
        foulTeamA++;

        //Display current foul count
        DisplayTeamAFoul();
    }

    //**********************************************************************************************
    //**********************************************************************************************
    //Team B Functions

    //Display Team B Score
    private void DisplayTeamBGoal() {
        TextView display = (TextView) findViewById(R.id.teamBScore);
        display.setText(String.valueOf(goalTeamB));
    }

    //Display Team B Fouls
    private void DisplayTeamBFoul() {
        TextView display = (TextView) findViewById(R.id.foulTeamB);
        display.setText(String.valueOf(foulTeamB));
    }

    //Display Team B Yellow Cards
    private void DisplayTeamBYCard() {
        TextView display = (TextView) findViewById(R.id.yellowCardTeamB);
        display.setText(String.valueOf(yellowCardTeamB));
    }

    //Display Team B Red Cards
    private void DisplayTeamBRCard() {
        TextView display = (TextView) findViewById(R.id.redCardTeamB);
        display.setText(String.valueOf(redCardTeamB));
    }

    //onClick methods*****************************************************

    public void TeamBGoal(View v) {
        //Increment goal counter
        goalTeamB++;

        //Display current goal count
        DisplayTeamBGoal();
    }

    public void TeamBFoul(View v) {
        //Increment foul counter
        foulTeamB++;

        //Display current foul count
        DisplayTeamBFoul();
    }


    //**********************************************************************************************
}
