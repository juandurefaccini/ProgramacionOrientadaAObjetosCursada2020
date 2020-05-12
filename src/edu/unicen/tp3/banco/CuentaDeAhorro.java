package edu.unicen.tp3.banco;

public class CuentaDeAhorro {
    String nombre;
    float saldo = 0;

    public CuentaDeAhorro() {
    }

    public CuentaDeAhorro(String nombre) {
        this.nombre = nombre;
    }

    public void addSaldo(float monto) {
        saldo += monto;
    }

    public boolean extraerSaldo(float monto) {
        if (saldo > monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        CuentaDeAhorro that = (CuentaDeAhorro) o;
        return Float.compare(that.saldo, saldo) == 0;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static void main(String[] args) {
//        CuentaDeAhorro c1 = new CuentaDeAhorro();
//        CuentaCorriente c2 = new CuentaCorriente(200);
//
//        c2.addSaldo(1000);
//        System.out.printtoString()ln(c2.getSaldo());
//        c2.extraerSaldo(1100);
//        System.out.println(c2.getSaldo());
//

    }
}
