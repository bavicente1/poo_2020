
package gui_factura;


public class Material {
    String nombre;
    int cantidad;
    double valor;
    double descuento;
    double totalDesc, subTotal, totalIVA;

    public Material(String nombre, int cantidad, double valor, double descuento) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
        this.descuento = 1-(descuento / 100);
    }

  
    public double getTotalDesc() {
       totalDesc =Double.parseDouble(String.format("%.2f", (getTotalIVA()*descuento))); 
        return totalDesc;
    }

    public double getSubTotal() {
       subTotal = Double.parseDouble(String.format("%.2f", (cantidad * valor)));
        return subTotal;
    }

    public double getTotalIVA() {
       totalIVA = Double.parseDouble(String.format("%.2f", (getSubTotal() * 1.12)));
        return totalIVA;
    }
    
    
}
