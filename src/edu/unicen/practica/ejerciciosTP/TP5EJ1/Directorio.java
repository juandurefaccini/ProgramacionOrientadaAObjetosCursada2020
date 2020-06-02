package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Directorio extends EFS {
    Set<EFS> archivos = new HashSet<>();

    public Directorio(String nombre) {
        super(nombre, " ");
    }

    public void addArchivo(EFS archivo) {
        archivos.add(archivo);
    }

    public Set<EFS> getArchivos() {
        return Collections.unmodifiableSet(archivos);
    }

    @Override
    public int getSize() {
        int totalSize = 0; //Asumo que la carpeta no pesa nada
        for (EFS archivo : archivos) totalSize = totalSize + archivo.getSize();
        return totalSize;
    }

    @Override
    public int getCantElementos() {
        int totalCant = 1;
        for (EFS archivo : archivos) totalCant = totalCant + archivo.getCantElementos();
        return totalCant;
    }

    @Override
    public String toString() {
        return "Directorio{" + archivos + '}';
    }
}
