package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ejercicioObesidad1y2.AbdomenO;
import ejerciciosSobrepeso2.AbdomenS2;
import ejerciciosSobrepeso2.Cardio2S2;
import ejerciciosSobrepeso2.CardioS2;
import ejerciciosSobrepeso2.PiernaColaS2;

public class MusculoS2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculo_s2);
    }

    public void MusculoS2_Abdomen(View view){

        Intent intent=new Intent(MusculoS2.this, AbdomenS2.class);
        startActivity(intent);
    }

    public void MusculoS2_Cardios2(View view){

        Intent intent=new Intent(MusculoS2.this, CardioS2.class);
        startActivity(intent);
    }

    public void MusculoS2_cardio2s2(View view){

        Intent intent=new Intent(MusculoS2.this, Cardio2S2.class);
        startActivity(intent);
    }

    public void MusculoS2_Piernas2(View view){

        Intent intent=new Intent(MusculoS2.this, PiernaColaS2.class);
        startActivity(intent);
    }
}
