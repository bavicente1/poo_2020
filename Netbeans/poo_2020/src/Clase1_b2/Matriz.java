
package Clase1_b2;


public class Matriz {
      private final int lim = 3;
      private int matrizA[][] = new int[lim][lim];
      private int matrizB[][] = new int[lim][lim];
      private int matrizC[][] = new int[lim][lim];
      
      public void sumar(){
          //recorremos filas
          for (int fila = 0; fila < matrizA.length; fila++) {
              //recorre columnas
              for (int col = 0; col < matrizA[0].length; col++) {
                  matrizC[fila][col] = matrizA[fila][col] + matrizB[fila][col];
                  
              }
              
          }
      }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
      
      
}
