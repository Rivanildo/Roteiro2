package com.example.rivanildo.ssegundoroteiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TradutorFraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradutor_fra);

        TextView txt = (TextView)findViewById(R.id.textView3);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String cor = b.getString("cor");
        String tradu ="";
        if(cor.equalsIgnoreCase("amarelo")) {
            tradu += "JAUNE";
        }
        else if(cor.equalsIgnoreCase("azul")) {
            tradu += "BLEU";
        }
        else{
            tradu +="ROUGE";
        }
        txt.setText("A cor " + cor + " em FRANCÊS é: " + tradu);
    }
}
