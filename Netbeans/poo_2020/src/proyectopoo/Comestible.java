/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;


public class Comestible extends Producto {
    private String fecha_Ven;
    private String fecha_Elab;

    public Comestible(String fecha_Ven, String fecha_Elab, int id, String nombre, int Stock, double valor) {
        super(id, nombre, Stock, valor);
        this.fecha_Ven = fecha_Ven;
        this.fecha_Elab = fecha_Elab;
        super.tipoProducto = "Comestible";
    }
    
    
    
}
