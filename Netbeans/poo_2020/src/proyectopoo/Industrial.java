
package proyectopoo;


public class Industrial extends Producto{
//    private String tipo; //Manufacturado, agricola etc..

    public Industrial(int id, String nombre, int Stock, double valor) {
        super(id, nombre, Stock, valor);
        super.tipoProducto = "Industrial";
    }
    
}
