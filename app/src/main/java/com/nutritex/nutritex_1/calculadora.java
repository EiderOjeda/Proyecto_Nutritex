package com.nutritex.nutritex_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    EditText etPeso, etAltura;
    Button  btCalcular;
    TextView tvIMC;
    //String imc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        etPeso=(EditText) findViewById(R.id.etPeso);
        etAltura=(EditText) findViewById(R.id.etAltura);
        btCalcular=(Button) findViewById(R.id.btCalcular);
        tvIMC=(TextView) findViewById(R.id.tvIMC);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(calculadora.this, pesoidealcalculado.class);

                double peso, altura, IMC;
                peso=Double.parseDouble(etPeso.getText().toString());
                altura=Double.parseDouble(etAltura.getText().toString());
                IMC=peso/Math.pow(altura,2);
                String imc2 = String.valueOf(IMC);
                //tvIMC.setText(""+IMC);
                intent.putExtra("imc",imc2); //obtener el resultado
                startActivity(intent);


            }
        });
    }

}
