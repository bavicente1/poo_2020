//Ejercicio 7
package Tarea5;

import java.util.Scanner;

public class EjecutarAlumno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double[] calificaciones = new double[3];
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese las 3 Calificaciones: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Nº " + (i+1));
            calificaciones[i] = sc.nextDouble();
        }
        Alumno alumno = new Alumno(nombre, calificaciones);
        System.out.println("La nota final de: " + alumno.getNombre()+
                " Es: " + alumno.Calcular());
        
    }
}
