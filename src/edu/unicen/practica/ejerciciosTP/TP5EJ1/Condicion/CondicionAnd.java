package edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.EFS;

public class CondicionAnd extends CondicionEFS{
    CondicionEFS c1;
    CondicionEFS c2;

    public CondicionAnd(CondicionEFS c1, CondicionEFS c2){
        this.c1=c1;
        this.c2=c2;
    }
    @Override
    public boolean cumpleCondicion(EFS efs) {
        return c1.cumpleCondicion(efs) && c2.cumpleCondicion(efs);
    }
}
