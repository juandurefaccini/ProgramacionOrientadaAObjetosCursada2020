package edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.EFS;

public class CondicionFecha extends CondicionEFS{
    String fechac;

    public CondicionFecha(String fechac) {
        this.fechac = fechac;
    }

    @Override
    public boolean cumpleCondicion(EFS efs) {
        return efs.getFechaC().equals(fechac);
    }
}
