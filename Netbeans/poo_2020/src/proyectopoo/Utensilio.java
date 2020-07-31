/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

public class Utensilio extends Producto{
    
    public Utensilio(int id, String nombre, int Stock, double valor) {
        super(id, nombre, Stock, valor);
        super.tipoProducto = "Utensilio";
    }
    
}
