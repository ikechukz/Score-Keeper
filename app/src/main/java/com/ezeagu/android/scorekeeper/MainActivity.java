package com.ezeagu.android.scorekeeper;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {
    TextView goalAText;
    TextView goalBText;
    TextView cornerAText;
    TextView cornerBText;
    TextView ycardAText;
    TextView ycardBText;
    TextView fkickAText;
    TextView fkickBText;
    TextView penaltyAText;
    TextView penaltyBText;
    TextView rcardAText;
    TextView rcardBText;

    Button goalA;
    Button goalB;
    Button cornerA;
    Button cornerB;
    Button ycardA;
    Button ycardB;
    Button rcardA;
    Button rcardB;
    Button fkickA;
    Button fkickB;
    Button penaltyA;
    Button penaltyB;
    Button reset;

    int scoreA = 0;
    int penaltyAscore = 0;
    int scoreB = 0;
    int penaltyBscore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer();

        goalA = (Button) findViewById(R.id.team_a_goal_button);
        goalB = (Button) findViewById(R.id.team_b_goal_button);
        penaltyA = (Button) findViewById(R.id.team_a_penalty);
        penaltyB = (Button) findViewById(R.id.team_b_penalty);
        cornerA = (Button) findViewById(R.id.team_a_corner);
        cornerB = (Button) findViewById(R.id.team_b_corner);
        ycardA = (Button) findViewById(R.id.team_a_ycard);
        ycardB = (Button) findViewById(R.id.team_b_ycard);
        rcardA = (Button) findViewById(R.id.team_a_rcard);
        rcardB = (Button) findViewById(R.id.team_b_rcard);
        fkickA = (Button) findViewById(R.id.team_a_fkick);
        fkickB = (Button) findViewById(R.id.team_b_fkick);
        reset = (Button) findViewById(R.id.reset);


        goalA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalAText = (TextView) findViewById(R.id.team_a_goal);
                scoreA += 1;
                goalAText.setText(String.valueOf(scoreA));
                scoreColor();
            }
        });

        goalB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalBText = (TextView) findViewById(R.id.team_b_goal);
                scoreB += 1;
                goalBText.setText(String.valueOf(scoreB));
                scoreColor();
            }
        });

        penaltyA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalAText = (TextView) findViewById(R.id.team_a_goal);
                penaltyAText = (TextView) findViewById(R.id.team_a_penalty_text);
                scoreA += 1;
                penaltyAscore += 1;
                goalAText.setText(String.valueOf(scoreA));
                penaltyAText.setText(String.valueOf(penaltyAscore));
                scoreColor();

            }
        });

        penaltyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goalBText = (TextView) findViewById(R.id.team_b_goal);
                penaltyBText = (TextView) findViewById(R.id.team_b_penalty_text);
                scoreB += 1;
                penaltyBscore += 1;
                goalBText.setText(String.valueOf(scoreB));
                penaltyBText.setText(String.valueOf(penaltyBscore));
                scoreColor();

            }
        });

        cornerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cornerAText = (TextView) findViewById(R.id.team_a_corner_text);
                int score = Integer.parseInt(cornerAText.getText().toString());
                score += 1;
                cornerAText.setText(String.valueOf(score));

            }
        });

        cornerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cornerBText = (TextView) findViewById(R.id.team_b_corner_text);
                int score = Integer.parseInt(cornerBText.getText().toString());
                score += 1;
                cornerBText.setText(String.valueOf(score));

            }
        });

        ycardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ycardAText = (TextView) findViewById(R.id.team_a_ycard_text);
                int score = Integer.parseInt(ycardAText.getText().toString());
                score += 1;
                ycardAText.setText(String.valueOf(score));

            }
        });

        ycardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ycardBText = (TextView) findViewById(R.id.team_b_ycard_text);
                int score = Integer.parseInt(ycardBText.getText().toString());
                score += 1;
                ycardBText.setText(String.valueOf(score));

            }
        });

        rcardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rcardAText = (TextView) findViewById(R.id.team_a_rcard_text);
                int score = Integer.parseInt(rcardAText.getText().toString());
                score += 1;
                rcardAText.setText(String.valueOf(score));

            }
        });

        rcardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rcardBText = (TextView) findViewById(R.id.team_b_rcard_text);
                int score = Integer.parseInt(rcardBText.getText().toString());
                score += 1;
                rcardBText.setText(String.valueOf(score));

            }
        });

        fkickA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fkickAText = (TextView) findViewById(R.id.team_a_fkick_text);
                int score = Integer.parseInt(fkickAText.getText().toString());
                score += 1;
                fkickAText.setText(String.valueOf(score));

            }
        });

        fkickB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fkickBText = (TextView) findViewById(R.id.team_b_fkick_text);
                int score = Integer.parseInt(fkickBText.getText().toString());
                score += 1;
                fkickBText.setText(String.valueOf(score));

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent = getIntent();
                finish();
                startActivity(mIntent);

            }
        });

    }

    public void scoreColor() {
        goalAText = (TextView) findViewById(R.id.team_a_goal);
        goalBText = (TextView) findViewById(R.id.team_b_goal);

        int goal1 = Integer.parseInt(goalAText.getText().toString());
        int goal2 = Integer.parseInt(goalBText.getText().toString());

        if (goal1 > goal2) {
            goalAText.setTextColor(rgb(47, 235, 40));
            goalBText.setTextColor(rgb(240, 9, 56));
        } else if (goal2 > goal1) {
            goalBText.setTextColor(rgb(47, 235, 40));
            goalAText.setTextColor(rgb(240, 9, 56));
        } else {
            goalAText.setTextColor(rgb(0, 0, 0));
            goalBText.setTextColor(rgb(0, 0, 0));
        }

    }

    private void Timer() {

        new CountDownTimer(90000, 1000) {
            @Override
            public void onTick(long l) {
                TextView textView = (TextView) findViewById(R.id.timer);
                textView.setText(l / 1000 + "mins");
            }

            @Override
            public void onFinish() {
                TextView textView = (TextView) findViewById(R.id.timer);
                textView.setText("0 mins");
                GameOver();

            }
        }.start();
    }

    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage(message())
                .setCancelable(false)
                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent mIntent = getIntent();
                        finish();
                        startActivity(mIntent);
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                        finish();
                    }
                });
        alertDialogBuilder.show();

    }

    public String message(){
        String text;

        if (scoreA > scoreB){
             text = "FRANCE " + scoreA + " - " + "SWEDEN " + scoreB + "\n"
                    + "Penalty FRANCE  : " + penaltyAscore + "\n"
                    + "Penalty SWEDEN : " + penaltyBscore + "\n"
                    + "FRANCE WINS";
            return text;
        }
        else if (scoreA < scoreB){
             text = "FRANCE " + scoreA + " - " + "SWEDEN " + scoreB + "\n"
                    + "Penalty FRANCE  : " + penaltyAscore + "\n"
                    + "Penalty SWEDEN : " + penaltyBscore + "\n"
                    + "SWEDEN WINS";
            return text;
        }
        else {
                 text = "FRANCE " + scoreA + " - " + "SWEDEN " + scoreB + "\n"
                        + "Penalty FRANCE  : " + penaltyAscore + "\n"
                        + "Penalty SWEDEN : " + penaltyBscore + "\n"
                        + "IT IS A DRAW";
                return text;
        }
    }
}


