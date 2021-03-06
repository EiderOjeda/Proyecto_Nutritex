package ejerciciosSobrepeso1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nutritex.nutritex_1.MusculoS1;
import com.nutritex.nutritex_1.MusculosNormal;
import com.nutritex.nutritex_1.R;

import ejerciciosNormal.AbdomenN;

public class AbdomenS1 extends AppCompatActivity implements View.OnClickListener{

    Button btSiguiente, btAnterior;
    ImageView ivAbdomenS1;
    int[]abdomenId={
            R.drawable.crunch,
            R.drawable.tijeras,
            R.drawable.plancha,

    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdomenn);

        btSiguiente=(Button)(findViewById(R.id.btSiguiente));
        btAnterior=(Button)(findViewById(R.id.btAnterior));
        ivAbdomenS1=(ImageView)(findViewById(R.id.ivAbdomenN));

        btAnterior.setOnClickListener(this);
        btSiguiente.setOnClickListener(this);

        total=abdomenId.length;
    }

    public void onclick1(View view){

        Intent miIntent=new Intent(AbdomenS1.this,MusculoS1.class);
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
        ivAbdomenS1.setImageResource(abdomenId[i]);

    }
}
