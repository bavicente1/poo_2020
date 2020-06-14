
package deber1_b2;


public class MatrizTraspuesta {
    private int[][] matrizO, matrizT;

    public MatrizTraspuesta(int[][] matrizO) {
        this.matrizO = matrizO;
        matrizT = new int[matrizO[0].length][matrizO.length];
    }
    
    public int[][] Traspuesta(){
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT [i][j] = matrizO[j][i];
            }
        }
        return matrizT;
    }
    
    
}
