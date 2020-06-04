package edu.unicen.practica.parcial2018.condiciones;

import edu.unicen.practica.parcial2018.Noticia;

public class CondicionElementoAND extends CondicionElemento {
    CondicionElemento c1;
    CondicionElemento c2;
    public CondicionElementoAND(CondicionElemento c1, CondicionElemento c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return c1.cumple(noticia) && c2.cumple(noticia);
    }
}
