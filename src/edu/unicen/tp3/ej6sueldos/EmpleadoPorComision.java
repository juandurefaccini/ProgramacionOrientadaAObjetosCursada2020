package edu.unicen.tp3.ej6sueldos;

public class EmpleadoPorComision extends EmpleadoFijo {
    int cantVentas;
    float porcentajeComision;

    public EmpleadoPorComision(String nombre, float salario) {
        super(nombre, salario);
    }

    public float getSalario(int precio) {
        return super.getSalario() + getCantVentas() * getPorcentajeComision() * precio;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
