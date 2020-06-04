package edu.unicen.practica.parcial2018.condiciones;

import edu.unicen.practica.parcial2018.Noticia;

public class CondicionElementoAutor extends CondicionElemento {
    String autor;
    public CondicionElementoAutor(String autor){
        this.autor=autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(this.autor);
    }
}

