package edu.unicen.tp3.EJ9_procesadoresYTareas;

public class Tarea {
    double usoMemoria;
    double usoCPU;
    int prioridad;

    public Tarea(double usoMemoria, double usoCPU, int prioridad) {
        this.usoMemoria = usoMemoria;
        this.usoCPU = usoCPU;
        this.prioridad = prioridad;
    }

    public double getUsoMemoria() {
        return usoMemoria;
    }

    public void setUsoMemoria(double usoMemoria) {
        this.usoMemoria = usoMemoria;
    }

    public double getUsoCPU() {
        return usoCPU;
    }

    public void setUsoCPU(double usoCPU) {
        this.usoCPU = usoCPU;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "{" +
                "Mem=" + usoMemoria +
                ", CPU=" + usoCPU +
                ", prior=" + prioridad +
                '}';
    }
}
