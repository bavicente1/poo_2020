
package deber1_b2;

import java.util.Scanner;


public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas ;
        int[][] matriz;
        System.out.println("Ingrese las filas ");
        filas = sc.nextInt();
        System.out.println("Ingrese las columnas");
        columnas = sc.nextInt();
        matriz = new int[filas][columnas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["+ (i+1) +"]" + "[" + (j+1) +"] : " );
                matriz[i][j] = sc.nextInt();
            }   
        }
        Matriz men = new Matriz(matriz);
        men.SumaYPromedio();
        System.out.println("La suma de la matriz es: " + men.getSuma());
        System.out.println("El promedio de la matriz es: " + men.getPromedio());
    }
}
