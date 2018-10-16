package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ejercicioExtremoMorbido.BrazoEM;
import ejercicioExtremoMorbido.CardioEM;
import ejercicioExtremoMorbido.PiernaEM;
import ejerciciosFlacos.PiernaColaF;

public class MusculoEM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculo_em);
    }

    public void MusculoEM_Brazo(View view){

        Intent intent=new Intent(MusculoEM.this, BrazoEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Pierna(View view){

        Intent intent=new Intent(MusculoEM.this, PiernaEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Cardio(View view){

        Intent intent=new Intent(MusculoEM.this, CardioEM.class);
        startActivity(intent);
    }

    public void MusculoEM_Planes(View view){

        Intent intent=new Intent(MusculoEM.this, PlanesEjercicios.class);
        startActivity(intent);
    }
}
