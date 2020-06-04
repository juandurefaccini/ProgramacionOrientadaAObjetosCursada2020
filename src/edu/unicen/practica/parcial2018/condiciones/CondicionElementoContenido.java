package edu.unicen.practica.parcial2018.condiciones;

import edu.unicen.practica.parcial2018.Noticia;

public class CondicionElementoContenido extends CondicionElemento {
    String contenido;
    public CondicionElementoContenido(String contenido){
        this.contenido=contenido;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getContenido().contains(this.contenido);
    }
}
