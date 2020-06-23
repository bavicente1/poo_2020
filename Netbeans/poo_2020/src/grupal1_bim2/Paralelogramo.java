
package grupal1_bim2;


public class Paralelogramo  extends Figura{
    
    public Paralelogramo(String nombre, int ladoMayor, int ladoMenor) {
        super(nombre, ladoMayor, ladoMenor);
    }
    
    public int CalcularArea(){
       int area = (super.ladoMayor*super.ladoMenor);
        return area;
    }

    public int CalcularPerimetro(){
          int  per = (2 * super.ladoMayor) + (2 *super.ladoMenor);
          return per;
    }
    
}
