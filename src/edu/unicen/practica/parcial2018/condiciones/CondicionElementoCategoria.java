package edu.unicen.practica.parcial2018.condiciones;

import edu.unicen.practica.parcial2018.Noticia;

public class CondicionElementoCategoria extends CondicionElemento {
    String categoria;
    public CondicionElementoCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getCategoria().equals(this.categoria);
    }
}
