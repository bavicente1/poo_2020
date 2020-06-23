
package grupal1_bim2;

public class Figura {
    protected String nombre;
    protected int ladoMayor, ladoMenor;

    public Figura(String nombre, int ladoMayor, int ladoMenor) {
        this.nombre = nombre;
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    public  String getNombre(){
        return this.nombre;
    }
}
