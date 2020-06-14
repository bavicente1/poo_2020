package Clase1_b2;

import java.util.Scanner;

public class EjecutaVector {

    public static void main(String[] args) {
        vector men = new vector();
        Scanner sc = new Scanner(System.in);
        int vectorA[] = new int[5], vectorB[] = new int[5];
        int producto;

        crearVector(vectorA);
        crearVector(vectorB);
        
        men.setVectorA(vectorA);
        men.setVectorB(vectorB);
        men.calcularProducto();
        System.out.println("Sumatoria de producto: " + men.getProducto());
        System.out.println("VECTOR A: ");
        mostrarVector(vectorA);
        System.out.println("\nVECTOR B: ");
        mostrarVector(vectorB);
       
    }
        
    public static void crearVector(int []vect) {
        for (int i = 0; i < vect.length; i++) {
                 vect[i] = (int) (Math.random() * 10 + 1);
        }
    }
    public static void mostrarVector(int []vect) {
        for (int i = 0; i < vect.length; i++) {
           
                System.out.printf("|%-3s", vect[i]);
           
        }

    }
}
