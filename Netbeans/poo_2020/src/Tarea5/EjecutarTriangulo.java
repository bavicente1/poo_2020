//Ejercicio 8
package Tarea5;

import java.util.Scanner;

public class EjecutarTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Ingrese los ángulos del triangulo: ");
        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();
        
        Triangulo triangulo = new Triangulo(a, b, c);
        System.out.println("El tipo de triangulo es: " + triangulo.ComprobarTipo());
        
    }
}
