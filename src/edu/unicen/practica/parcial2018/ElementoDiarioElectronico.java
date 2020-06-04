package edu.unicen.practica.parcial2018;

import edu.unicen.practica.parcial2018.condiciones.CondicionElemento;
import edu.unicen.practica.parcial2018.modificacion.ModificacionElemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class ElementoDiarioElectronico {
    public abstract String getCategoria();
    public abstract Set<String> getPalabrasClave();
    public abstract void actualizarNoticia(CondicionElemento c, ModificacionElemento m);
    public abstract ElementoDiarioElectronico copiaRestringida(CondicionElemento c);

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}
