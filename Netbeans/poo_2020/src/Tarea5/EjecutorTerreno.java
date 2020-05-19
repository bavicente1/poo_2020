//Ejercicio 1
package Tarea5;

import java.util.Scanner;

public class EjecutorTerreno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo, ancho, precio;
        System.out.println("Introduzca el largo del Terreno: ");
        largo = sc.nextDouble();
        System.out.println("Ancho:");
        ancho = sc.nextDouble();
        System.out.println("Precio: ");
        precio = sc.nextDouble();

        Terreno terreno = new Terreno(largo, ancho, precio);
        terreno.Calcular();
        terreno.Imprimir();
    }
}
