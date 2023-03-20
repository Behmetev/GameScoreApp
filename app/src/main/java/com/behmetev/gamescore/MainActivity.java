package com.behmetev.gamescore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewScore1 = findViewById(R.id.textViewScoreTeam1);
        TextView textViewScore2 = findViewById(R.id.textViewScoreTeam2);

        textViewScore1.setText("" + score1);
        textViewScore1.setText("" + score2);
    }
}