
package herenciaVolumen;

public class Cilindro extends Figura {
    private double altura;

    public Cilindro(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }
    
       public double getVolumen(){
        super.volumen = Math.PI*(super.getLado()*super.getLado())*altura;
        return super.volumen;
    }
}
