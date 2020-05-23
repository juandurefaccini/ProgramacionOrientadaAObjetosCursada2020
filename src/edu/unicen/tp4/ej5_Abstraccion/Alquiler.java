package edu.unicen.tp4.ej5_Abstraccion;

import edu.unicen.tp3.banco.Cliente;

import java.time.LocalDate;

public class Alquiler {
    LocalDate fechaInicio;
    int plazo;
    Producto producto;
    Cliente cliente;

    public Alquiler(LocalDate fechaInicio, int plazo, Producto producto, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.plazo = plazo;
        this.producto = producto;
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public static void main(String[] args) {
    }
}
