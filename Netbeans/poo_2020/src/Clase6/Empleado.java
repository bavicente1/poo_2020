package Clase6;

public class Empleado {

    private String nombre;
    private int horas;
    private double cuota, sueldo;

    public Empleado(String nombre, int horas, double cuota) {
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }


    public void calcularSueldo() {
        if (horas <= 40) {
            sueldo = horas * cuota;
        } else {
            sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
        }
    }
}
