package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionEFS;

import java.util.HashSet;
import java.util.Set;

public class Link extends EFS {
    EFS linked;
    static final int size = 10;

    public Link(String nombre, String fechaC, EFS linked) {
        super(nombre, fechaC);
        this.linked = linked;
    }

    public EFS getLinked() {
        return linked;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getCantElementos() {
        return 0;
    }

    @Override
    public Set<EFS> cumpleCondicion(CondicionEFS c) {
        Set<EFS> result = new HashSet<>();
        if(c.cumpleCondicion(this)){
            result.add(this);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Link: " + nombre + "," + linked.getNombre();
    }
}
