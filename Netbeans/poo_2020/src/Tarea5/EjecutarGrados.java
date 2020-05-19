//Ejercicio 16
package Tarea5;

import java.util.Scanner;

public class EjecutarGrados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double grad;
        Grados grados = new Grados();
        System.out.println("Elija el tipo de Dato a ingresar"
                + "\n1)Celsius"
                + "\n2)Farenheint"
                + "\n3)Kelvin"
                + "\n4)Rankie)");
        opcion = sc.nextInt();

        System.out.println("Introduzca la cantidad de grados: ");
        grad = sc.nextDouble();

        switch (opcion) {
            case 1:
                //Con C
                grados.setC(grad);
                break;
            case 2:
                //con f
                grados.setF(grad);
                break;
            case 3:
                //con k
                grados.setK(grad);
                break;
            case 4:
                //con r
                grados.setR(grad);
                break;
        }
        grados.calcular(opcion);

        System.out.println("Cantidad en:"
                + "\n Cº: " + grados.getC()
                + "\n Fº: " + grados.getF()
                + "\n Kº: " + grados.getK()
                + "\n Rº: " + grados.getR());
    }
}
