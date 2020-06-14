
package deber1_b2;


public class Matriz {
     private int[][] matriz;
   private int suma;
   private double promedio;

    public Matriz(int[][] matriz) {
        this.matriz = matriz;
    }
   
   public void SumaYPromedio(){
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[0].length; j++) {
               suma = suma + matriz[i][j];
          
           }
           
       }
       promedio = suma / (matriz.length * matriz[0].length);
   }

    public int getSuma() {
        return suma;
    }

    public double getPromedio() {
        return promedio;
    }
     
}
