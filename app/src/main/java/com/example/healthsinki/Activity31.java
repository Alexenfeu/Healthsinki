package com.example.healthsinki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity31 extends AppCompatActivity {
    private static Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_31);
    }
    public void OnClickButtonListener(Bundle savedInstanceState) {
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Intent callActivity = new Intent(getApplicationContext(), Activity21.class);
                startActivity(callActivity);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Intent callActivity = new Intent(getApplicationContext(), Activity22.class);
                startActivity(callActivity);
            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @
                    Override
            public void onClick(View v) {
                Intent callActivity = new Intent(getApplicationContext(), Activity23.class);
                startActivity(callActivity);
            }
        });
    }
}
