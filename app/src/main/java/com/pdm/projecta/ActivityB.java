package com.pdm.projecta;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle bund = getIntent().getExtras();

        String txt1 = bund.getString("TESTE");
        int numero1 = bund.getInt("NUMERO");

        TextView txtViewString = findViewById(R.id.textViewString);
        TextView txtViewInt = findViewById(R.id.textViewInt);

        txtViewString.setText(txt1);
        txtViewInt.setText("Numero: " + numero1);


    }
}
