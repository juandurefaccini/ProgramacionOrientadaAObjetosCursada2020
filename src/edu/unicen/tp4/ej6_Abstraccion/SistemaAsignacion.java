package edu.unicen.tp4.ej6_Abstraccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SistemaAsignacion {
    String nombre;
    List<Evaluador> evaluadores = new ArrayList<>();
    List<TrabajoTexto> textos = new ArrayList<>();
    Collection<String> temasEspecificos = new ArrayList<>(); //Uso coleccion porque no necesito acceder a un indice
    //especifico ademas de permitirme hacer mas rapida la interseccion

    public SistemaAsignacion(String nombre) {
        this.nombre = nombre;
    }

    public boolean esExperto(Evaluador evaluador) {
        return Collections.disjoint(temasEspecificos, evaluador.getCollectionTemas());
    }


}
