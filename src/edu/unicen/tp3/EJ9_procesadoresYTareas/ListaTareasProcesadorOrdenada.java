package edu.unicen.tp3.EJ9_procesadoresYTareas;

abstract public class ListaTareasProcesadorOrdenada extends ListaTareasProcesador {

    public void addTarea(Tarea tarea) {
        if (!tareaList.isEmpty()) {
            int i = 0;
            while (i < tareaList.size() && esMenor(tarea, tareaList.get(i))) { //Recorro toda la lista hasta que encuentre el lugar
                //Recorro la lista
                i++;
            }
            tareaList.add(i, tarea);
        } else {
            tareaList.add(tarea);
        }
    }

    abstract public boolean esMenor(Tarea a, Tarea b);

    public static void main(String[] args) {

    }
}
