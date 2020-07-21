
package herenciaVolumen;

public class Esfera extends Figura {
    
    public Esfera(double lado) {
        super(lado);
    }
       public double getVolumen(){
        super.volumen = (4/3)*Math.PI*(Math.pow(volumen, 3));
        return super.volumen;
    }
}
