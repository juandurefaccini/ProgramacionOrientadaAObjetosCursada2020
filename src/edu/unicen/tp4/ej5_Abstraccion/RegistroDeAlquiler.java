package edu.unicen.tp4.ej5_Abstraccion;

import edu.unicen.tp3.banco.Cliente;

import java.util.ArrayList;
import java.util.List;

//El sistema solamente es un registro
public class
RegistroDeAlquiler {
    String nombre;
    List<Alquiler> alquilerList = new ArrayList<>();
    List<Cliente> clienteList = new ArrayList<>();

    public RegistroDeAlquiler(String nombre) {
        this.nombre = nombre;
    }

    public addAlquiler(Producto producto, int plazo) {
        alquilerList.add(new Alquiler());
    }
}
