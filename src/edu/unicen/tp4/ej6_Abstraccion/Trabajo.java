package edu.unicen.tp4.ej6_Abstraccion;

import java.util.ArrayList;
import java.util.Collection;

public class Trabajo {
    String nombre;
    Collection<String> temasTratados = new ArrayList<>();

    public Trabajo(String nombre){
        this.nombre = nombre;
    }

    public void addTema(String tema){
        temasTratados.add(tema);
    }

    public boolean puedeSerEvaluado(Evaluador evaluador){
        return evaluador.getCollectionTemas().containsAll(temasTratados);
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "nombre='" + nombre + '\'' +
                ", temasTratados=" + temasTratados +
                '}';
    }
}
