package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import java.util.Comparator;

public class ComparableNombre extends ElementoComparable {
    @Override
    public int compare(EFS o1, EFS o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
