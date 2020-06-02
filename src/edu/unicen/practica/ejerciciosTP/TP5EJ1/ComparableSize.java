package edu.unicen.practica.ejerciciosTP.TP5EJ1;

public class ComparableSize extends ElementoComparable{
    @Override
    public int compare(EFS o1, EFS o2) {
        return o1.getSize()-o2.getSize();
    }
}
