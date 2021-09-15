package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class AutoActivity extends AppCompatActivity {

    private CheckBox CB4;
    private CheckBox CB5;
    private CheckBox CB6;
    private Button FinalBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        CB4 = findViewById(R.id.CB4);
        CB5 = findViewById(R.id.CB5);
        CB6 = findViewById(R.id.CB6);
        FinalBtn = findViewById(R.id.FinalBtn);


        FinalBtn.setOnClickListener((view)->{

            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);

        });
    }
}