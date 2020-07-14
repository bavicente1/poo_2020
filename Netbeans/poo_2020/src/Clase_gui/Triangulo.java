
package Clase_gui;


public class Triangulo {
    private double base, altura , area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
     
    }

    
    
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura)/2;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    
}
