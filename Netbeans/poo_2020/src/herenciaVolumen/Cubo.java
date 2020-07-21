
package herenciaVolumen;
public class Cubo extends Figura{
    
    public Cubo(double lado) {
        super(lado);
    }
    
    public double getVolumen(){
        super.volumen = super.getLado()*super.getLado()*super.getLado();
        return super.volumen;
    }
    
}
