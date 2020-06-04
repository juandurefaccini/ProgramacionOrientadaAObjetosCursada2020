package edu.unicen.practica.parcial2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeccionFarandula extends Seccion{
    @Override
    public String getCategoria() {
        return "Seccion farandula";
    }

    @Override
    public Set<String> getPalabrasClave() {
        List<String> l = new ArrayList<>(super.getPalabrasClave());
        l.sort(String::compareTo);
        return new HashSet<>(l.subList(0,14));
    }
}
