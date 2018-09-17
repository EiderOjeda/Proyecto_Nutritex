package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pesoidealcalculado extends AppCompatActivity {

    TextView tvIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesoidealcalculado);

        tvIMC=(TextView)findViewById(R.id.tvIMC);
        Bundle bundle=getIntent().getExtras();
        String imc=bundle.getString("imc").toString();
        tvIMC.setText(imc);

//        if(imc<=18.5){}
//        if(imc>18.5 && imc<24.9){}
//        if(imc>24.9 && imc<26.9){}
//        if(imc>26.9 && imc<29.9){}
//        if(imc>29.9 && imc<34.9){}
//        if(imc>34.9 && imc<39.9){}
//        if(imc>39.9 && imc<49.9){}
//        if(imc>50){}
//
//        switch (){}
    }

    public void Onclick(View view){

        Intent intent=new Intent(pesoidealcalculado.this, inicio.class);
        startActivity(intent);
    }


}
