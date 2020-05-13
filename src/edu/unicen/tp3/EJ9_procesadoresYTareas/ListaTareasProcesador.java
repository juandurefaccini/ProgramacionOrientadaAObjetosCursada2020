package edu.unicen.tp3.EJ9_procesadoresYTareas;

import java.util.ArrayList;
import java.util.List;

abstract public class ListaTareasProcesador {
    List<Tarea> tareaList = new ArrayList<>();

    abstract public void addTarea(Tarea tarea);


    public Tarea getPrimera() {
        if (tareaList.isEmpty()) {
            return null;
        } else {
            return tareaList.get(0);
        }
    }

    public void removePrimera() {
        tareaList.remove(0);
    }

    @Override
    public String toString() {
        return "List{" +
                tareaList +
                '}';
    }
}


