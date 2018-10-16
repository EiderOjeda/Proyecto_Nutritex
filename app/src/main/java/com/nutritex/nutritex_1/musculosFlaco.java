package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ejerciciosFlacos.BicepsF;
import ejerciciosFlacos.EspaldaF;
import ejerciciosFlacos.PechoF;
import ejerciciosFlacos.PiernaColaF;
import ejerciciosFlacos.TricepsF;

public class musculosFlaco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musculos_flaco);
    }

    public void MusculoFlaco_planesEjercicios(View view){

        Intent intent=new Intent(musculosFlaco.this, PlanesEjercicios.class);
        startActivity(intent);
    }

    public void MusculoFlaco_Biceps(View view){

        Intent intent=new Intent(musculosFlaco.this, BicepsF.class);
        startActivity(intent);
    }

    public void MusculoFlaco_Triceps(View view){

        Intent intent=new Intent(musculosFlaco.this, TricepsF.class);
        startActivity(intent);
    }

    public void MusculoFlaco_Pecho(View view){

        Intent intent=new Intent(musculosFlaco.this, PechoF.class);
        startActivity(intent);
    }

    public void MusculoFlaco_Espalda(View view){

        Intent intent=new Intent(musculosFlaco.this, EspaldaF.class);
        startActivity(intent);
    }

    public void MusculoFlaco_Pierna(View view){

        Intent intent=new Intent(musculosFlaco.this, PiernaColaF.class);
        startActivity(intent);
    }
}
