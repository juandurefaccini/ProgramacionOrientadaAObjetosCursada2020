package edu.unicen.practica.ejerciciosTP.TP5EJ1;

public class Comprimido extends Directorio {
    double compresion;
    final String tipo;

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
