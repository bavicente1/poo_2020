
package proyectopoo;


public class Oficina extends Producto{
    
    public Oficina(int id, String nombre, int Stock, double valor) {
        super(id, nombre, Stock, valor);
        super.tipoProducto = "Oficina";
    }
    
   
}
