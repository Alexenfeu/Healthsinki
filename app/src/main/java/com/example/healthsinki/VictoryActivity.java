package com.example.healthsinki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VictoryActivity extends AppCompatActivity {
    private static Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
        OnClickButtonListener(savedInstanceState);
    }

    public void OnClickButtonListener(Bundle savedInstanceState) {
        b1 = (Button) findViewById(R.id.bVictory);
        b1.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Intent callActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(callActivity);
            }
        });
    }
}
