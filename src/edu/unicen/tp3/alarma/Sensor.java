package edu.unicen.tp3.alarma;

public class Sensor {
    String zona;
    String tipo;
    boolean estado;

    public Sensor(String tipo, String zona) {
        this.zona = zona;
        this.tipo = tipo;
        this.estado = false;
    }

    public void setEstado(boolean bool) {
        this.estado = bool;
    }

    public boolean getActivado() {
        return estado;
    }

    public String getZona() {
        return zona;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tipo= " + tipo +
                ", zona='" + zona;
    }

    public static void main(String[] args) {
//        Sensor sensor = new Sensor("Vidrio");
//        Boolean b1 = false;
//        Boolean b2 = true;
//        sensor.addSensor(b1);
//        sensor.addSensor(b2);
//        System.out.println(sensor.activado());
    }
}
