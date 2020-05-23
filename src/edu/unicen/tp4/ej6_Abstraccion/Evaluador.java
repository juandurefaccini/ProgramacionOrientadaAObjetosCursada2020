package edu.unicen.tp4.ej6_Abstraccion;

import java.util.*;

public class Evaluador {
    String nombre;
    Set<String> listaTemas = new HashSet<>();

    public Evaluador(String nombre){
        this.nombre = nombre;
    }

    public void addTema(String tema){
        listaTemas.add(tema);
    }

    public Collection<?> getCollectionTemas() {
        return Collections.unmodifiableCollection(listaTemas);
    }

    @Override
    public String toString() {
        return "Evaluador{" +
                "nombre='" + nombre + '\'' +
                ", listaTemas=" + listaTemas +
                '}';
    }

    public static void main(String[] args) {
        Evaluador evaluador = new Evaluador("Juan");
        evaluador.addTema("a");
        evaluador.addTema("a");
        evaluador.addTema("b");
        System.out.println(evaluador.toString());
    }


}
