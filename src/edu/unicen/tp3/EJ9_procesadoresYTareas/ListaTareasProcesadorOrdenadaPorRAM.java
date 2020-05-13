package edu.unicen.tp3.EJ9_procesadoresYTareas;

public class ListaTareasProcesadorOrdenadaPorRAM extends ListaTareasProcesadorOrdenada {

    @Override
    public boolean esMenor(Tarea a, Tarea b) {
        return a.getUsoMemoria() < b.getUsoMemoria();
    }
}
