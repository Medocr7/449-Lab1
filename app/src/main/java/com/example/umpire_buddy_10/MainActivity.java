package com.example.umpire_buddy_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int Snumber;
    public int Bnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView StrikeText  = findViewById(R.id.numstrike);
        Button pressStrike = findViewById(R.id.ClickMe);
        pressStrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snumber = Snumber + 1;

                StrikeText.setText(String.valueOf(Snumber));
            }
        });
        final TextView BallText  = findViewById(R.id.numball);
        Button  PressBall = findViewById(R.id.BallSpeed);
        pressStrike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bnumber = Bnumber + 1;

                BallText.setText(String.valueOf(Bnumber));
            }
        });

        Button PressReset = findViewById(R.id.Startover);
        PressReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snumber = 0;
                Bnumber = 0;
                StrikeText.setText(String.valueOf(Snumber));
                BallText.setText(String.valueOf(Bnumber));
            }
        });
        Button PressExit = findViewById(R.id.GetOut);
        PressExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        finish();
        System.exit(0);
        }
    }

