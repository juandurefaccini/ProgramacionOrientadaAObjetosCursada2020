package edu.unicen.practica.parcial2018.condiciones;

import edu.unicen.practica.parcial2018.Noticia;

public class CondicionElementoTitulo extends CondicionElemento {
    String titulo;
    public CondicionElementoTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().contains(this.titulo);
    }
}
