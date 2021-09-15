package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ActividadActivity extends AppCompatActivity {

    private CheckBox CB1;
    private CheckBox CB2;
    private CheckBox CB3;
    private Button ContBnt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);

        CB1 = findViewById(R.id.CB1);
        CB2 = findViewById(R.id.CB2);
        CB3 = findViewById(R.id.CB3);
        ContBnt2 = findViewById(R.id.ContBnt2);


        ContBnt2.setOnClickListener((view)->{

            Intent autoIntent = new Intent(this,AutoActivity.class);
            startActivity(autoIntent);

        });





    }
}