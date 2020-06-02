package edu.unicen.practica.ejerciciosTP.TP5EJ1;

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
}
