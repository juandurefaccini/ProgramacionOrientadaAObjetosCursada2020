package edu.unicen.tp3.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    String nombre;
    List<Cliente> clientes = new ArrayList<>();

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            return clientes.get(clientes.indexOf(cliente));
        }
        return null;
    }

    public boolean addCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean borrarCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Banco banco = new Banco("Santander Rio");
        Cliente cliente1 = new Cliente("Juan", "Dure", 41824820);
        CuentaDeAhorro c2 = new CuentaDeAhorro("Ahorros");
        CuentaDeAhorro c3 = new CuentaDeAhorro("Ahorros 2");
        CuentaDeAhorro c4 = new CuentaDeAhorro("Ahorros 3");

        banco.addCliente(cliente1);
        banco.getCliente(cliente1).addCuenta(c2);
        banco.getCliente(cliente1).addCuenta(c3);
        banco.getCliente(cliente1).addCuenta(c4);

        banco.getCliente(cliente1).getCuenta(c2).addSaldo(200);
        banco.getCliente(cliente1).getCuenta(c3).addSaldo(300);
        banco.getCliente(cliente1).getCuenta(c4).addSaldo(400);
//        banco.getCliente(cliente1).getCuenta(new CuentaDeAhorro("null")).addSaldo(400);

        banco.getCliente(cliente1).getCuenta(c2).extraerSaldo(100);

        System.out.println(banco.getCliente(cliente1));
    }
}
