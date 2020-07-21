
package herenciaVolumen;

public class Cono extends Figura{
       private double altura;
    public Cono(double lado, double altura) {
        super(lado);
            this.altura = altura;
    }
       public double getVolumen(){
         super.volumen = (1/3)*Math.PI*(super.getLado()*super.getLado())*altura;
        return super.volumen;
    }
}
