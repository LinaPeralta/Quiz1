package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class AutoActivity extends AppCompatActivity {

    private CheckBox CB4;
    private CheckBox CB5;
    private CheckBox CB6;
    private Button FinalBtn;
    private int puntaje2=0;
    private int subtotal;
    private int p2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        CB4 = findViewById(R.id.CB4);
        CB5 = findViewById(R.id.CB5);
        CB6 = findViewById(R.id.CB6);
        FinalBtn = findViewById(R.id.FinalBtn);

        p2 = getIntent().getExtras().getInt("puntaje");


        FinalBtn.setOnClickListener((view)->{

            //metodo de los checkbox donde se suma el puntaje
            check();
            //metodo para validar si se ha elegido una opcion
            validate();
        });

    }

    private void check(){
        String mns = "Seleccionado: \n";

        if (CB4.isChecked()){
            mns+="Opcion 1";
            puntaje2+=3;


        }
        if (CB5.isChecked()){
            mns+="Opcion 2";
            puntaje2+=3;

        }
        if (CB6.isChecked()){
            mns+="Opcion 3";
            puntaje2+=0;

        }
        Toast.makeText(getApplicationContext(),mns,Toast.LENGTH_SHORT).show();
    }

    private void validate(){

        if(CB4.isChecked() == true || CB5.isChecked() == true || CB6.isChecked() == true){


           subtotal = puntaje2 + p2;


           SharedPreferences preferences = getSharedPreferences("puntaje",MODE_PRIVATE);
           preferences.edit().putString("puntos", ""+subtotal).apply();
            Toast.makeText(this, "" + subtotal, Toast.LENGTH_SHORT).show();


            Intent mainIntent = new Intent(this, AutoActivity.class);
            startActivity(mainIntent);

        }else{
            Toast.makeText(getApplicationContext(),"Por favor seleccione una opción para continuar",Toast.LENGTH_SHORT).show();
        }
    }
}