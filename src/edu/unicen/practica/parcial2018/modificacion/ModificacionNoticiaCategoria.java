package edu.unicen.practica.parcial2018.modificacion;

import edu.unicen.practica.parcial2018.Noticia;

public class ModificacionNoticiaCategoria extends ModificacionElemento {
    String categoria;
    public ModificacionNoticiaCategoria(String categoria){
        this.categoria=categoria;
    }

    public ModificacionNoticiaCategoria(String categoria, ModificacionElemento m2){
        this.categoria=categoria;
        this.m2=m2;
    }



    @Override
    public void modificar(Noticia noticia) {
        noticia.setCategoria(this.categoria);
        if (m2!=null)
            m2.modificar(noticia);
    }
}
