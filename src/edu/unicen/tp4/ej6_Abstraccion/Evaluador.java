package edu.unicen.tp4.ej6_Abstraccion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Evaluador {
    Collection<String> listaTemas = new ArrayList<>();

    public Collection<String> getCollectionTemas() {
        return Collections.unmodifiableCollection(listaTemas);
    }


}
