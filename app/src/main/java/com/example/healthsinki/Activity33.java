package com.example.healthsinki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity33 extends AppCompatActivity {
    private static Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_33);
        OnClickButtonListener(savedInstanceState);
    }
    public void OnClickButtonListener(Bundle savedInstanceState) {
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Intent callActivity = new Intent(getApplicationContext(), VictoryActivity.class);
                startActivity(callActivity);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Mauvaise réponse", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Mauvaise réponse", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
