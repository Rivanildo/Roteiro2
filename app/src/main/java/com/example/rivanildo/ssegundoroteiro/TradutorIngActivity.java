package com.example.rivanildo.ssegundoroteiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TradutorIngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradutor_ing);
        TextView txt = (TextView)findViewById(R.id.textView4);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String cor = b.getString("cor");
        String tradu ="";
        if(cor.equalsIgnoreCase("amarelo")) {
            tradu += "YELLOW";
        }
        else if(cor.equalsIgnoreCase("azul")) {
            tradu += "BLUE";
        }
        else{
            tradu +="RED";
        }
        txt.setText("A cor " + cor + " em INGLÊS é: " + tradu);

    }
}
