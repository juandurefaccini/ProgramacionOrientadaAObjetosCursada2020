package edu.unicen.tp3.EJ9_procesadoresYTareas;

public class ListaTareasProcesadorOdenadaPorCPU extends ListaTareasProcesadorOrdenada {
    @Override
    public boolean esMenor(Tarea a, Tarea b) {
        return a.getUsoCPU() < b.getUsoCPU();
    }

    public static void main(String[] args) {

    }
}
