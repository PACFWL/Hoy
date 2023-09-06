package com.pdm.projecta;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        String teste = "Teste de String";
        int numero = 1213;

        Button btnAbreActivity = findViewById(R.id.button);
        btnAbreActivity.setOnClickListener(
          e -> {
              Bundle bundle = new Bundle();
              bundle.putString("TESTE", teste);
              bundle.putInt("NUMERO", numero);

              Intent abrirActivityB = new Intent(
              this, ActivityB.class
              );
              abrirActivityB.putExtras(bundle);
              startActivity(abrirActivityB);
          }
        );
    }
}
