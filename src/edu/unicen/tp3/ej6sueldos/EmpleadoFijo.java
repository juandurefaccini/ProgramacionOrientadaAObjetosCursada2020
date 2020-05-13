package edu.unicen.tp3.ej6sueldos;

public class EmpleadoFijo {
    String nombre;
    float salario;

    public String getNombre() {
        return nombre;
    }

    public EmpleadoFijo() {

    }

    public EmpleadoFijo(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + "," + "salario= " + salario;
    }

    public static void main(String[] args) {
        EmpleadoFijo e1 = new EmpleadoFijo("Juan", 10000);
        EmpleadoHorasExtras e2 = new EmpleadoHorasExtras("JuanHorasExtras", 10000);
        EmpleadoPorComision e3 = new EmpleadoPorComision("JuanComision", 10000);
//        EmpleadoFijo e4 = new EmpleadoHorasExtras("a",1);

        System.out.println();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println();

        e3.setCantVentas(10);
        e3.setPorcentajeComision(0.5f);

        e2.setHorasExtras(10);
        e2.setPrecioHorasExtra(15);

        System.out.println(e1.getSalario());
        System.out.println(e2.getSalario(5, 1));
        System.out.println(e3.getSalario(5));
    }
}
