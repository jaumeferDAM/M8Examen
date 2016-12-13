package com.example.alumnedam.m8examen.test;

import com.example.alumnedam.m8examen.control.Pregunta;

import java.util.ArrayList;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Test {

    private ArrayList<Pregunta> llistaPreguntes = new ArrayList<>();



    public ArrayList<Pregunta> obtenirPreguntes(int tema, int numeroPreguntes) {

        for (int cont = 0; cont < numeroPreguntes; cont++) {
            if (tema == 1) {
                llistaPreguntes.add(new Pregunta("Pregunta número " + cont + " Quan fan 2 + 2?", 4));
                llistaPreguntes.add(new Pregunta("Pregunta número " + cont + " Quan fan 6 + 1?", 7));

            }
            if (tema == 2) {
                llistaPreguntes.add(new Pregunta("Pregunta número " + cont + " Quan fan 4 - 2?", 2));
                llistaPreguntes.add(new Pregunta("Pregunta número " + cont + " Quan fan 6 - 1?", 5));

            }
        }
        return llistaPreguntes;
    }
}
