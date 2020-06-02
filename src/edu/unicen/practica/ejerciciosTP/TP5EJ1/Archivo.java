package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionEFS;

import java.util.HashSet;
import java.util.Set;

public class Archivo extends EFS {
    String fechaM;
    String extension;
    int size;

    @Override
    public Set<EFS> cumpleCondicion(CondicionEFS c) {
        Set<EFS> result = new HashSet<>();
        if(c.cumpleCondicion(this)){
            result.add(this);
        }
        return result;
    }

    public Archivo(String nombre, String extension, int size) {
        super(nombre, " ");
        this.fechaM = fechaM;
        this.extension = extension;
        this.size = size;
    }

    public String getFechaM() {
        return fechaM;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int getCantElementos() {
        return 1;
    }

    @Override
    public String toString() {
        return getNombre() + "." + extension + " size: " + getSize();
    }

    public void setSize(int size) {
        this.size = size;
    }
}
