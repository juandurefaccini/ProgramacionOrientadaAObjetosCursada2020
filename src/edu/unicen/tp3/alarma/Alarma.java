package edu.unicen.tp3.alarma;

import java.util.ArrayList;
import java.util.List;

public class Alarma {
    Timbre timbre = new Timbre();
    List<Sensor> sensores = new ArrayList<>();
    boolean puerta;
    boolean ventana;
    boolean movimiento;

    public Alarma() {
    }

    public Alarma(Timbre timbre) {
        puerta = false;
        ventana = false;
        movimiento = false;
    }

    public void reiniciar() {
        puerta = false;
        ventana = false;
        movimiento = false;
        timbre.apagar();
    }

    public boolean addSensor(Sensor sensor) {
        if (!sensores.contains(sensor)) {
            sensores.add(sensor);
            return true;
        }
        return false;
    }

    public boolean comprobar() {
        List<Sensor> sensorList = new ArrayList<>();
        for (Sensor sensor : sensores) {
            if (sensor.getActivado() && sensor.getTipo().equals("Ventana")) {
                ventana = true;
                timbre.prender();
                sensorList.add(sensor);
            } else {
                if (sensor.getActivado() && sensor.getTipo().equals("Puerta")) {
                    puerta = true;
                    timbre.prender();
                    sensorList.add(sensor);
                } else {
                    if (sensor.getActivado() && sensor.getTipo().equals("Movimiento")) {
                        movimiento = true;
                        timbre.prender();
                        sensorList.add(sensor);
                    }
                }
            }
        }
        for (Sensor sensor : sensorList) {
            System.out.println(sensor.toString());
        }
        return timbre.activado();
    }

    public static void main(String[] args) {
        Timbre timbre = new Timbre();
        Alarma a1 = new Alarma(timbre);

        Sensor s1 = new Sensor("Ventana", "Garage");
        Sensor s2 = new Sensor("Ventana", "Dormitorio");
        Sensor s3 = new Sensor("Ventana", "Living");

        Sensor s4 = new Sensor("Puerta", "Living");
        Sensor s5 = new Sensor("Puerta", "Garage");

        Sensor s6 = new Sensor("Movimiento", "Garage");
        Sensor s7 = new Sensor("Movimiento", "Dormitorio");

        s1.setEstado(true);
        s4.setEstado(true);
        s2.setEstado(true);
        s6.setEstado(true);
        s7.setEstado(true);

        a1.addSensor(s1);
        a1.addSensor(s2);
        a1.addSensor(s3);
        a1.addSensor(s4);
        a1.addSensor(s5);
        a1.addSensor(s6);
        a1.addSensor(s7);

        System.out.println(a1.comprobar());
    }
}
