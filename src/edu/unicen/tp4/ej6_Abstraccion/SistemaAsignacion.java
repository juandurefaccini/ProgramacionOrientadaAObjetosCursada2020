package edu.unicen.tp4.ej6_Abstraccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SistemaAsignacion {
    String nombre;
    Collection<Evaluador> evaluadores = new ArrayList<>();
    Collection<Trabajo> trabajos = new ArrayList<>();
    Collection<String> temasEspecificos = new ArrayList<>(); //Uso coleccion porque no necesito acceder a un indice
    //especifico ademas de permitirme hacer mas rapida la interseccion

    public SistemaAsignacion(String nombre) {
        this.nombre = nombre;
    }

    public boolean esExperto(Evaluador evaluador) {return !Collections.disjoint(temasEspecificos, evaluador.getCollectionTemas());}

    public Collection<?> posiblesEvaluadores(Trabajo trabajo){
        Collection<Evaluador> posiblesEvaluadores = new ArrayList<>();
        for (Evaluador evaluador : evaluadores){
            if (trabajo.puedeSerEvaluado(evaluador)){
                posiblesEvaluadores.add(evaluador);
            }
        }
        return Collections.unmodifiableCollection(posiblesEvaluadores);
    }

    public Collection<?> posiblesTextos(Evaluador evaluador){
        Collection<Trabajo> posiblesTextos = new ArrayList<>();
        for (Trabajo trabajo : trabajos){
            if (trabajo.puedeSerEvaluado(evaluador)){
                posiblesTextos.add(trabajo);
            }
        }
        return Collections.unmodifiableCollection(posiblesTextos);
    }
}
