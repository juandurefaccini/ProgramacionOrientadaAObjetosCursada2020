package edu.unicen.tp4.ej5_Abstraccion;

import edu.unicen.tp3.banco.Cliente;

import java.time.LocalDate;

public class ClienteAlquiler extends Cliente {
    LocalDate finPenalizacion;
    boolean penalizado;

    public ClienteAlquiler(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        penalizado = false;
    }

    public boolean isPenalizado() {
        return penalizado;
    }

    public boolean setPenalizado(Boolean penalizado) {
        this.penalizado = penalizado;
    }
}
