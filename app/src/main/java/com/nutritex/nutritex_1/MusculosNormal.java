package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ejerciciosFlacos.PiernaColaF;
import ejerciciosNormal.AbdomenN;
import ejerciciosNormal.BicepsN;
import ejerciciosNormal.EspaldaN;
import ejerciciosNormal.PechoN;
import ejerciciosNormal.PiernaColaN;
import ejerciciosNormal.TricepsN;

public class MusculosNormal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculos_normal);
    }

    public void Musculos_Abdomen(View view){

        Intent intent=new Intent(MusculosNormal.this, AbdomenN.class);
        startActivity(intent);
    }

    public void Musculos_BicepsN(View view){

        Intent intent=new Intent(MusculosNormal.this, BicepsN.class);
        startActivity(intent);
    }

    public void Musculos_EspaldaN(View view){

        Intent intent=new Intent(MusculosNormal.this, EspaldaN.class);
        startActivity(intent);
    }

    public void Musculos_PechoN(View view){

        Intent intent=new Intent(MusculosNormal.this, PechoN.class);
        startActivity(intent);
    }

    public void Musculos_PiernaColaN(View view){

        Intent intent=new Intent(MusculosNormal.this, PiernaColaN.class);
        startActivity(intent);
    }

    public void Musculos_TricepsN(View view){

        Intent intent=new Intent(MusculosNormal.this, TricepsN.class);
        startActivity(intent);
    }

    public void Musculos_planes(View view){

        Intent intent=new Intent(MusculosNormal.this, PlanesEjercicios.class);
        startActivity(intent);
    }


}
