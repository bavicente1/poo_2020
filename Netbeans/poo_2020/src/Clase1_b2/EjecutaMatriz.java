
package Clase1_b2;


public class EjecutaMatriz {
    public static void main(String[] args) {
      final int lim = 3;
      int matrizA[][] = new int[lim][lim];
      int matrizB[][] = new int[lim][lim];
    
      
      Matriz men = new Matriz();
      
        crearArreglo(matrizA);
        crearArreglo(matrizB);
      men.setMatrizA(matrizA);
      men.setMatrizB(matrizB);
      men.sumar();
        int matrizC[][] = men.getMatrizC();
        //Muestra A y B 
        System.out.println("Matriz A");
        mostrarArreglo(matrizA);
        System.out.println("Matriz B");
        mostrarArreglo(matrizB);
        //Se presenta el resultado
        System.out.println("Matriz C");
       
        mostrarArreglo(matrizC);
    }
    
    public static void crearArreglo(int[][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20 + 1);

            }
        }
    }

    public static void mostrarArreglo(int [][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("|%-3s", matriz[i][j]);

            }
            System.out.println("|");
        }
        System.out.println("");
    }
}
