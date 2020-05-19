
package Tarea5;


public class Triangulo {
    private double a , b , c;
    private String tipo;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String ComprobarTipo(){
        double angulos = a + b + c;
        if (angulos == 90) {
            tipo = "Rectángulo";
        } else if (angulos > 90 && angulos < 180){
            tipo = "Obtusángulo";
        } else {
            tipo = "Acutángulo";
        }
        return  tipo;
    }
    
}
