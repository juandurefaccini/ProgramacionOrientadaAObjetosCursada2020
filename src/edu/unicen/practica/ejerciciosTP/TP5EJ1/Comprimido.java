package edu.unicen.practica.ejerciciosTP.TP5EJ1;

import edu.unicen.practica.ejerciciosTP.TP5EJ1.Condicion.CondicionEFS;

import java.util.HashSet;
import java.util.Set;

public class Comprimido extends Directorio {
    double compresion;
    final String tipo;

    @Override
    public Set<EFS> cumpleCondicion(CondicionEFS c) {
        Set<EFS> result = new HashSet<>();
        for (EFS elem : archivos){
            if(c.cumpleCondicion(elem)){
                result.add(this);
                return result;
            }

        }
        return result;
    }

    public Comprimido(String nombre, double compresion, String tipo) {
        super(nombre);
        this.compresion = compresion;
        this.tipo = tipo;
    }

    @Override
    public int getSize() {
        return (int) (super.getSize() / compresion);
    }

    @Override
    public int getCantElementos() {
        return 1;
    }

    @Override
    public String toString() {
        return "Comprimido{" + nombre + "." + tipo + " s:" + getSize();
    }
}
