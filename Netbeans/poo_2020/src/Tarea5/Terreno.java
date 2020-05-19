package Tarea5;

public class Terreno {

    private double largo, ancho, precio, area, precioFin;

    public Terreno(double largo, double ancho, double precio) {
        this.largo = largo;
        this.ancho = ancho;
        this.precio = precio;
    }

    public void Calcular() {
        area = largo * ancho;
        if (area > 400) {
            precioFin = precio * 0.9;
        } else {
            precioFin = precio;
        }
    }

    public void Imprimir() {
        System.out.println("El área del Terreno es: " + area);
        System.out.println("El precio final del Terreno es: " + precioFin);
    }

}
