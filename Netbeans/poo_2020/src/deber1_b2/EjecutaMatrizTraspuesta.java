
package deber1_b2;

import java.util.Scanner;

public class EjecutaMatrizTraspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        int[][] matrizO;
         System.out.println("Ingrese las filas ");
        filas = sc.nextInt();
        System.out.println("Ingrese las columnas");
        columnas = sc.nextInt();
        matrizO = new int[filas][columnas];
        for (int i = 0; i < matrizO.length; i++) {
            for (int j = 0; j < matrizO[0].length; j++) {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "] : ");
                matrizO[i][j] = sc.nextInt();
            }
        }
        MatrizTraspuesta men = new MatrizTraspuesta(matrizO);
        System.out.println("Matriz Original: ");
        ImprimirMatriz(matrizO);
        System.out.println("Matriz Traspuesta");
        ImprimirMatriz(men.Traspuesta());
    }
    
   public static void ImprimirMatriz(int[][] matriz){
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j]+ "]" );
                
            }
            System.out.println("");
        }
   }
}
