package edu.unicen.practica.parcial2018.modificacion;

import edu.unicen.practica.parcial2018.Noticia;

public class ModificacionNoticiaPalabraClave extends ModificacionElemento {
    String palabraClave;
    public ModificacionNoticiaPalabraClave(String palabraClave){
        this.palabraClave=palabraClave;
    }

    public ModificacionNoticiaPalabraClave(String palabraClave, ModificacionElemento m2){
        this.palabraClave=palabraClave;
        this.m2 = m2;
    }

    @Override
    public void modificar(Noticia noticia) {
        noticia.addPalabraClave(this.palabraClave);
        if (m2!=null)
            m2.modificar(noticia);
    }
}
