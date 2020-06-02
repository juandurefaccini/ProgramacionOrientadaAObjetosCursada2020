package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionEFS;

import java.util.Set;

public abstract class EFS {
    String nombre;
    String fechaC;

    public EFS(String nombre, String fechaC) {
        this.nombre = nombre;
        this.fechaC = fechaC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public abstract int getSize();

    public abstract int getCantElementos();

    public String getFechaC(){ return fechaC;}

    public abstract Set<EFS> cumpleCondicion(CondicionEFS c);

    public static void main(String[] args) {
        Directorio dir = new Directorio("Juan");
    }
}
