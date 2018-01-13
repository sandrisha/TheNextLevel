package com.example.android.thenextlevel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreGoalA = 0;
    int scoreGoalN = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Reset the score for both teams back to 0.
     */
    public void resetScore (View v){
        scoreGoalA = 0;
        scoreGoalN = 0;
        displayForGoalA(scoreGoalA);
        displayForGoalN(scoreGoalN);
    }
    //GOAL ACHIEVED
    /**
     * Increase the score for Goal Achieved by 10% for Project 1.
     */
    public void add10ProjectOne(View v) {
        scoreGoalA = scoreGoalA + 10;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 10% for Project 2.
     */
    public void add10ProjectTwo(View v) {
        scoreGoalA = scoreGoalA + 10;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 10% for Project 3.
     */
    public void add10ProjectThree(View v) {
        scoreGoalA = scoreGoalA + 10;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 15% for Quizzes.
     */
    public void add15Quizzes(View v) {
        scoreGoalA = scoreGoalA + 15;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 20% for Forums.
     */
    public void add20Forums(View v) {
        scoreGoalA = scoreGoalA + 20;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 20% for Creativity.
     */
    public void add20Creativity(View v) {
        scoreGoalA = scoreGoalA + 20;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Increase the score for Goal Achieved by 15% for Interest.
     */
    public void add15Interest(View v) {
        scoreGoalA = scoreGoalA + 15;
        displayForGoalA(scoreGoalA);
    }

    /**
     * Displays the given score for Goal Achieved.
     */
    public void displayForGoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //GOAL NOT ACHIEVED
    /**
     * Decrease the score for Goal not Achieved by 10% for Project 1.
     */
    public void remove10ProjectOne(View v) {
        scoreGoalN = scoreGoalN - 10;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 10% for Project 2.
     */
    public void remove10ProjectTwo(View v) {
        scoreGoalN = scoreGoalN - 10;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 10% for Project 3.
     */
    public void remove10ProjectThree(View v) {
        scoreGoalN = scoreGoalN - 10;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 15% for Quizzes.
     */
    public void remove15Quizzes(View v) {
        scoreGoalN = scoreGoalN - 15;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 20% for Forums.
     */
    public void remove20Forums(View v) {
        scoreGoalN = scoreGoalN - 20;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 20% for Creativity.
     */
    public void remove20Creativity(View v) {
        scoreGoalN = scoreGoalN - 20;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Decrease the score for Goal not Achieved by 15% for Interest.
     */
    public void remove15Interest(View v) {
        scoreGoalN = scoreGoalN - 15;
        displayForGoalN(scoreGoalN);
    }

    /**
     * Displays the given score for Goal not Achieved.
     */
    public void displayForGoalN(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goal_n_score);
        scoreView.setText(String.valueOf(score));
    }
}

