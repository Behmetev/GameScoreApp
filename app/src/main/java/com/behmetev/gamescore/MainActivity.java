package com.behmetev.gamescore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            score1 = savedInstanceState.getInt("scoreTeam1");
            score2 = savedInstanceState.getInt("scoreTeam2");
        }

        TextView textViewScore1 = findViewById(R.id.textViewScoreTeam1);
        TextView textViewScore2 = findViewById(R.id.textViewScoreTeam2);

        textViewScore1.setText("" + score1);
        textViewScore2.setText("" + score2);

        textViewScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewScore1.setText("" + ++score1);
            }
        });
        textViewScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewScore2.setText("" + ++score2);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeam1", score1);
        outState.putInt("scoreTeam2", score2);
    }
}