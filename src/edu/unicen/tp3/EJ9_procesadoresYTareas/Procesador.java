package edu.unicen.tp3.EJ9_procesadoresYTareas;

public class Procesador {
    ListaTareasProcesador listaTareas;
    String nombre;

    public Procesador(String nombre, ListaTareasProcesador listaTareas) {
        this.nombre = nombre;
        this.listaTareas = listaTareas;
    }

    public void cambiarOrdenamiento(ListaTareasProcesador listaTareas) {
        while (this.listaTareas.getPrimera() != null) {
            listaTareas.addTarea(this.listaTareas.getPrimera());
            this.listaTareas.removePrimera();
        }
        this.listaTareas = listaTareas;
    }

    public void addTarea(Tarea tarea) {
        listaTareas.addTarea(tarea);
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "listaTareas=" + listaTareas +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ListaTareasProcesadorSimple l = new ListaTareasProcesadorSimple();
        ListaTareasProcesadorOrdenadaPorRAM lRAM = new ListaTareasProcesadorOrdenadaPorRAM();
        ListaTareasProcesadorOdenadaPorCPU lCPU = new ListaTareasProcesadorOdenadaPorCPU();

        Tarea a = new Tarea(1.00, 3.00, 6);
        Tarea b = new Tarea(5.00, 1.00, 8);
        Tarea c = new Tarea(6.00, 6.00, 3);
        Tarea d = new Tarea(2.00, 4.00, 2);
        Tarea e = new Tarea(3.00, 2.00, 5);
        Tarea f = new Tarea(7.00, 5.00, 1);

        Procesador p = new Procesador("Intel i5", l);
        p.addTarea(a);
        p.addTarea(b);
        p.addTarea(c);
        p.addTarea(d);
        p.addTarea(e);
        p.addTarea(f);
        System.out.println();
        System.out.println();
        System.out.println(p.toString());
        System.out.println("RAM");
        p.cambiarOrdenamiento(lRAM);
        System.out.println();
        System.out.println();
        System.out.println(p.toString());
        System.out.println("CPU");
        p.cambiarOrdenamiento(lCPU);
        System.out.println();
        System.out.println();
        System.out.println(p.toString());
        System.out.println();
    }
}
