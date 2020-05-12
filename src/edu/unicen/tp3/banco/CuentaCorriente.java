package edu.unicen.tp3.banco;

public class CuentaCorriente extends CuentaDeAhorro {
    int margen;

    public CuentaCorriente(int margen) {
        this.margen = margen;
    }

    public CuentaCorriente(float monto, int margen) {
        this.saldo = monto;
        this.margen = margen;
    }

    @Override
    public boolean extraerSaldo(float monto) {
        if (saldo - monto > -this.margen) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
