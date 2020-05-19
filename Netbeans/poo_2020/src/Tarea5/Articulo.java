
package Tarea5;


public class Articulo {
    private String descripcion;
    private int cantidad;
    private double precioU, costo;

    public Articulo(String descripcion, int cantidad, double precioU) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioU = precioU;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }
    
    public void Calcular(){
        costo = precioU * cantidad;
        if (cantidad > 50) {
            costo = costo *0.85;
        }
    }
}
