package edu.unicen.tp3.EJ9_procesadoresYTareas;

public class ListaTareasProcesadorOrdenadaPorPrioridad extends ListaTareasProcesadorOrdenada {

    @Override
    public boolean esMenor(Tarea a, Tarea b) {
        return a.getPrioridad() < b.getPrioridad();
    }

    public static void main(String[] args) {
        Tarea a = new Tarea(1.00, 1.00, 6);
        Tarea b = new Tarea(1.00, 1.00, 8);
        Tarea c = new Tarea(1.00, 1.00, 3);

        ListaTareasProcesadorOrdenadaPorPrioridad f = new ListaTareasProcesadorOrdenadaPorPrioridad();
        f.addTarea(a);
        f.addTarea(b);
        f.addTarea(c);
        System.out.println(f);
    }
}
