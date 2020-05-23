package edu.unicen.tp4.ej6_Abstraccion;

import java.util.ArrayList;
import java.util.Collection;

public class Trabajo {
    Collection<String> temasTratados = new ArrayList<>();

    public boolean puedeSerEvaluado(Evaluador evaluador){
        return evaluador.getCollectionTemas().containsAll(temasTratados);
    }
}
