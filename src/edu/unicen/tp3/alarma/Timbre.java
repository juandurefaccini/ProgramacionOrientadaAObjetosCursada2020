package edu.unicen.tp3.alarma;

public class Timbre {
    boolean sonar;

    public Timbre() {
        sonar = false;
    }

    public void prender() {
        sonar = true;
    }

    public void apagar() {
        sonar = false;
    }

    public boolean activado() {
        return sonar;
    }
}
