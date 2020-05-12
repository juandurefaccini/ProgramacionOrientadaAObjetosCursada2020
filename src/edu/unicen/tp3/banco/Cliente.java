package edu.unicen.tp3.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    String nombre;
    String apellido;
    int dni;
    List<CuentaDeAhorro> cuentas = new ArrayList<>();

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void addCuenta(CuentaCorriente cuentaCorriente) {
        cuentas.add(cuentaCorriente);
    }

    public void addCuenta(CuentaDeAhorro cuentaDeAhorro) {
        cuentas.add(cuentaDeAhorro);
    }

    public List<CuentaDeAhorro> getCuentas() {
        return Collections.unmodifiableList(cuentas);
    }

    public boolean elimCuentas(CuentaDeAhorro cuenta) {
        if (cuentas.contains(cuenta)) {
            cuentas.remove(cuenta);
            return true;
        }
        return false;
    }

    public CuentaDeAhorro getCuenta(CuentaDeAhorro cuentaDeAhorro) {
        if (cuentas.contains(cuentaDeAhorro)) {
            return cuentas.get(cuentas.indexOf(cuentaDeAhorro));
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Dure", 41824820);
        CuentaDeAhorro c2 = new CuentaDeAhorro("Ahorros");
        cliente1.addCuenta(c2);
        cliente1.getCuenta(c2).addSaldo(500);
        System.out.println("Saldo de c2 = " + cliente1.getCuenta(c2).getSaldo());
    }
}

