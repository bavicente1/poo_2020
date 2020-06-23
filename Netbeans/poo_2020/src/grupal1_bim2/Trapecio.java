
package grupal1_bim2;


public class Trapecio extends Figura {
    private int altura, lado1, lado2;

  public Trapecio(int altura, int lado1, int lado2, String nombre, int ladoMayor, int ladoMenor) {
        super(nombre, ladoMayor, ladoMenor);
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int CalcularArea(){
       int area = ((super.ladoMayor+super.ladoMenor)*altura)/2;
        return area;
    }

    public int CalcularPerimetro(){
        int per = super.ladoMayor + super.ladoMenor + lado1+ lado2;
        return per;
    }
    
   
   
    
    
    
}
