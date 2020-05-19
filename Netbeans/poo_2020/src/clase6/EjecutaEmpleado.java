package clase6;

import java.util.Scanner;

public class EjecutaEmpleado {

    public static void main(String[] args) {
        String nombre;
        int horas;
        double cuota;
        char desea = 's';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del empleado");
            nombre = sc.nextLine();
            System.out.println("Ingrese el nº de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.println("Ingrese la cuota por hora ");
            cuota = sc.nextDouble();
            Empleado empleado = new Empleado(nombre, horas, cuota);
            empleado.calcularSueldo();
            System.out.println("Nombre del empleado: " + empleado.getNombre());
            System.out.println("El sueldo es: " + empleado.getSueldo());

            System.out.println("¿Desea ingresar otro empleado s/n?");
            desea = sc.next().toLowerCase().charAt(0);
        } while (desea == 's');


      
    }

}
