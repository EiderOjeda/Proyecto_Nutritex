package ejercicioObesidad1y2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.MusculosNormal;
import com.nutritex.nutritex_1.MusculosO;
import com.nutritex.nutritex_1.R;

import ejerciciosSobrepeso1.CardioS1;

public class CardioO extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivCardioO;
    int[]cardioId={
            R.drawable.bici,
            R.drawable.saltar,
            R.drawable.burpee,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardios1);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivCardioO=(ImageView)(findViewById(R.id.ivCardios1));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=cardioId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(CardioO.this,MusculosO.class);
        startActivity(miIntent);
    }

    @Override
    public void onClick(View view) {

        int id=view.getId();
        if(id==R.id.btSiguiente){
            i++;
            if (i==total) i=0;

        }
        if(id==R.id.btAnterior){
            i--;
            if (i==-1)i=total-1;

        }
        ivCardioO.setImageResource(cardioId[i]);

    }
}
