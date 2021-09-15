package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    private EditText NombreTxt;
    private EditText CodigoTxt;
    private Button ContBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        NombreTxt = findViewById(R.id.NombreTxt);
        CodigoTxt = findViewById(R.id.CodigoTxt);
        ContBtn1 = findViewById(R.id.ContBtn1);


        ContBtn1.setOnClickListener((view)->{

            Intent actiIntent = new Intent(this,ActividadActivity.class);
            startActivity(actiIntent);

        });

    }
}