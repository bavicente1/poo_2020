//Ejercicio 4
package Tarea5;

import java.util.Scanner;

public class EjecutorArticulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precioU;
        System.out.println("Introduzca los datos del artículo:");
        System.out.println("Descripcion: ");
        descripcion = sc.nextLine();
        System.out.println("Precio Unitario: ");
        precioU = sc.nextDouble();
        System.out.println("Cantidad: ");
        cantidad = sc.nextInt();
        
        Articulo articulo = new Articulo(descripcion, cantidad, precioU);
        articulo.Calcular();
        
        System.out.println( "Costo total de: " + articulo.getDescripcion() + " es de:" + articulo.getCosto());
    }
}
