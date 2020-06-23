
package grupal1_bim2;


public class Rombo extends Figura {
    
    public Rombo(String nombre, int ladoMayor, int ladoMenor) {
        super(nombre, ladoMayor, ladoMenor);
    }
   
     public int CalcularArea(){
       int area = (super.ladoMayor*super.ladoMenor)/2;
        return area;
    }

     public int CalcularPerimetro(){
        double lado =  Math.sqrt(((super.ladoMayor*super.ladoMayor) + (super.ladoMenor*super.ladoMenor)));
        int  per = (int) lado * 4;
        return per;
    }
    
   
    
    
}