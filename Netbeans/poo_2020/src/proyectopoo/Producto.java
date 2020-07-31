/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author bavic
 */
public class Producto {
    private int id;
    private String nombre;
    private int Stock;
    private double valor;
    protected String tipoProducto;

    public Producto(int id, String nombre, int Stock, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.Stock = Stock;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return Stock;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    
}
