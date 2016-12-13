package com.example.alumnedam.m8examen.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.alumnedam.m8examen.R;
import com.example.alumnedam.m8examen.test.Main2Activity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, AdapterView.OnItemClickListener {

    EditText editTextNom;
    private int numeroPreguntes;
    private int temaPreguntes;

    private RadioGroup radioGroupPreguntes;
    private RadioButton radioButton5;
    private RadioButton radioButton10;
    private RadioButton radioButton20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNom = (EditText)findViewById(R.id.editTextNom);
        Button buttonIniciarTest = (Button)findViewById(R.id.buttonIniciarTest);
        buttonIniciarTest.setOnClickListener(this);

        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        spinner.setOnItemClickListener(this);

        radioGroupPreguntes = (RadioGroup)findViewById(R.id.RGCuantitat);
        radioButton5 = (RadioButton)findViewById(R.id.radioButton5preguntes);
        radioButton10 = (RadioButton)findViewById(R.id.radioButton10preguntes);
        radioButton20 = (RadioButton)findViewById(R.id.radioButton20preguntes);

        radioGroupPreguntes.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("NombrePreguntes",numeroPreguntes);
        i.putExtra("TemaPreguntes",temaPreguntes);
        startActivity(i);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioGroupPreguntes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.radioButton5preguntes) {
                    numeroPreguntes = 5;
                } else if (checkedId == R.id.radioButton10preguntes) {
                    numeroPreguntes = 10;
                } else if (checkedId == R.id.radioButton20preguntes) {
                    numeroPreguntes = 20;
                }

            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getSelectedItem()==1) {
            temaPreguntes=1;
        }
    }
}
