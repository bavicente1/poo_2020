
package Clase1_b2;


public class vector {
    
    private int vectorA[] = new int[5], vectorB[]=new int[5];
    int producto;

    public void calcularProducto(){
        for (int i = 0; i < vectorA.length; i++) {
            producto = producto + (vectorA[i] * vectorB[i]);
            
        }
    }
    
    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    
}
