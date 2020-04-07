package com.example.dwiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView reg;
    private TextView submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg = findViewById(R.id.register);
        submit = findViewById(R.id.submit);
        reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent i;
                i = new Intent(MainActivity.this, register.class);
                startActivity(i);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(MainActivity.this, postLogin.class);
                startActivity(i);
            }
        });

    }
}