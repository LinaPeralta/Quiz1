package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadActivity extends AppCompatActivity {

    private CheckBox CB1;
    private CheckBox CB2;
    private CheckBox CB3;
    private Button ContBnt2;
    private int puntaje=0;
    private String p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);

        CB1 = findViewById(R.id.CB1);
        CB2 = findViewById(R.id.CB2);
        CB3 = findViewById(R.id.CB3);
        ContBnt2 = findViewById(R.id.ContBnt2);

       // p = String.valueOf(puntaje);


        ContBnt2.setOnClickListener((view)->{

            //metodo de los checkbox donde se suma el puntaje
                check();
                //metodo para validar si se ha elegido una opcion
                validate();

        });

    }

    private void check(){
        String mns = "Seleccionado: \n";

        if (CB1.isChecked()){
            mns+="Opcion 1";
            puntaje+=1;



        }
        if (CB2.isChecked()){
            mns+="Opcion 2";
            puntaje+=3;


        }
        if (CB3.isChecked()){
            mns+="Opcion 3";
            puntaje+=0;


        }

        Toast.makeText(getApplicationContext(),mns,Toast.LENGTH_SHORT).show();

    }

    private void validate(){

        if(CB1.isChecked() == true || CB2.isChecked() == true || CB3.isChecked() == true){

            Intent autoIntent = new Intent(this, AutoActivity.class);
            autoIntent.putExtra("puntaje",puntaje);
            startActivity(autoIntent);

        }else{
            Toast.makeText(getApplicationContext(),"Por favor seleccione una opción para continuar",Toast.LENGTH_SHORT).show();
        }
    }


}