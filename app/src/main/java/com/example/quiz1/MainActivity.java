package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity<RegistrarBtn> extends AppCompatActivity {


    private TextView EstudiantesTxt;
    private Button RegistrarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EstudiantesTxt=  findViewById(R.id.EstudiantesTxt);
        RegistrarBtn=  findViewById(R.id.RegistrarBtn);
    }
}