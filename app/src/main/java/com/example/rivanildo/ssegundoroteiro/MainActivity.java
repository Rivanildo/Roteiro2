package com.example.rivanildo.ssegundoroteiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button)).setOnClickListener(new Traduzir("TRADUZIR", null));
        ((Button) findViewById(R.id.ing)).setOnClickListener(new Traduzir("TRADUZIR", "INGLES"));
        ((Button) findViewById(R.id.fra)).setOnClickListener(new Traduzir("TRADUZIR", "FRANCES"));
    }

    private boolean validarEntrada(EditText editText){
        String valor = editText.getText().toString();
        return !(!valor.equalsIgnoreCase("Azul") && !valor.equalsIgnoreCase("Vermelho") && !valor.equalsIgnoreCase("Amarelo"));
    }

    private class Traduzir implements View.OnClickListener {
        private String action;
        private String category;

        Traduzir(String action, String category) {
            this.action = action;
            this.category = category;
        }


        @Override
        public void onClick(View v) {
            translate();
        }

        private void translate() {
            EditText editText = ((EditText) findViewById(R.id.editText));
            String nomeC = editText.getText().toString();

            if (validarEntrada(editText)) {
                Intent i = new Intent(this.action);
                if (this.category != null)
                    i.addCategory(this.category);
                Bundle b = new Bundle();
                b.putString("cor", nomeC);
                i.putExtras(b);
                startActivity(i);
            } else {
                View focus = null;
                if (TextUtils.isEmpty(nomeC)) {
                    editText.setError("Campo Vazio");
                    focus = editText;
                    focus.requestFocus();
                }
            }
        }
    }
}
