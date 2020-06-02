package edu.unicen.tp4.ej6_Abstraccion;

import java.util.Collections;

public class Poster extends Trabajo{
    public Poster(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedeSerEvaluado(Evaluador evaluador){
        return !Collections.disjoint(evaluador.getCollectionTemas(),temasTratados);
    }
}
