package com.example.dwiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class postLogin extends AppCompatActivity {
    private Button cancel;
    private Button benar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);
        cancel = findViewById(R.id.cancel);
        benar = findViewById(R.id.benar);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i = new Intent(postLogin.this, tidakBenar.class);
                startActivity(i);
            }
        });

        benar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i = new Intent(postLogin.this, dashboard.class);
                startActivity(i);
            }
        });
    }
}
