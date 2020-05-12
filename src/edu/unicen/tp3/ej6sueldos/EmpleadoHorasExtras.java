package edu.unicen.tp3.ej6sueldos;

public class EmpleadoHorasExtras extends EmpleadoFijo {
    int horasExtras = 0;
    float precioHorasExtra = 0;

    public EmpleadoHorasExtras(String nombre, float salario) {
        super(nombre, salario);
    }

    public EmpleadoHorasExtras(String nombre, float salario, int horasExtras, float precioHorasExtra) {
        super(nombre, salario);
        this.horasExtras = horasExtras;
        this.precioHorasExtra = precioHorasExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public float getPrecioHorasExtra() {
        return precioHorasExtra;
    }

    public void setPrecioHorasExtra(float precioHorasExtra) {
        this.precioHorasExtra = precioHorasExtra;
    }

    public float getSalario(int horasExtras, float precioHorasExtra) {
        return super.getSalario() + getHorasExtras() * getPrecioHorasExtra();
    }
}
