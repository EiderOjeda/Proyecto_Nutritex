package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ejercicioExtremoMorbido.BrazoEM;
import ejercicioObesidad1y2.AbdomenO;
import ejerciciosSobrepeso1.BicepsS1;
import ejerciciosSobrepeso1.Cardio2S1;
import ejerciciosSobrepeso1.CardioS1;
import ejerciciosSobrepeso1.PechoS1;
import ejerciciosSobrepeso1.PiernaColaS1;

public class MusculoS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculo_s1);
    }

    public void MusculoS1_Abdomen(View view){

        Intent intent=new Intent(MusculoS1.this, AbdomenO.class);
        startActivity(intent);
    }

    public void MusculoS1_Biceps(View view){

        Intent intent=new Intent(MusculoS1.this, BicepsS1.class);
        startActivity(intent);
    }

    public void MusculoS1_CardioS1(View view){

        Intent intent=new Intent(MusculoS1.this, CardioS1.class);
        startActivity(intent);
    }

    public void MusculoS1_Cardio2S1(View view){

        Intent intent=new Intent(MusculoS1.this, Cardio2S1.class);
        startActivity(intent);
    }

    public void MusculoS1_Pecho(View view){

        Intent intent=new Intent(MusculoS1.this, PechoS1.class);
        startActivity(intent);
    }

    public void MusculoS1_Piernas1(View view){

        Intent intent=new Intent(MusculoS1.this, PiernaColaS1.class);
        startActivity(intent);
    }
}
