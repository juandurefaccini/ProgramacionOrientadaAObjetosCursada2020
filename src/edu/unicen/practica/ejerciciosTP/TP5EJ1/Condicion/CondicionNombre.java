package edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.EFS;

import java.util.Set;

public class CondicionNombre extends CondicionEFS{
    String nombre;

    public CondicionNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumpleCondicion(EFS efs) {
        return efs.getNombre().equals(nombre);
    }
}
