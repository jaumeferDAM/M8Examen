package com.example.alumnedam.m8examen.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumnedam.m8examen.R;
import com.example.alumnedam.m8examen.control.Pregunta;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private int contador = 0;
    Button Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        Test test = new Test();
        Intent i = getIntent();
        Siguiente.setOnClickListener(this);


        int total = i.getIntExtra("NombrePreguntes", 0);
        int tema = i.getIntExtra("TemaPreguntes", 0);

        TextView enunciat = (TextView) findViewById(R.id.textViewEnunciat);

        ArrayList<Pregunta> llistaPreguntes = test.obtenirPreguntes(tema, total);

        for (int z = 0; z > llistaPreguntes.size(); z++) {
            enunciat.setText(llistaPreguntes.get(z).toString());


        }
    }


    @Override
    public void onClick(View view) {
            contador++;
        if(contador==5) {
            Siguiente.setText("Finalizar Test");
            finish();
        }


    }
}

