package grupal1_bim2;

import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, ladoA, ladoB, area = 0, perimetro = 0;
        String nombre = "";

        do {

            System.out.println("ÁREAS Y PERÍMETROS FIGURAS GEOMÉTRICAS:");
            System.out.println("1) Trapecio\n"
                    + "2) Rombo\n"
                    + "3) Paralelogramo\n"
                    + "0) Fin");
            System.out.print("Opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    int altura,
                     lado1,
                     lado2;
                    nombre = "Trapecio";
                    System.out.println("Introduzca los datos: ");
                    System.out.println("Altura: ");
                    altura = sc.nextInt();
                    System.out.println("Base mayor:");
                    ladoA = sc.nextInt();
                    System.out.println("Base menor");
                    ladoB = sc.nextInt();
                    System.out.println("Lado 1 y 2");
                    lado1 = sc.nextInt();
                    lado2 = sc.nextInt();
                    Trapecio trap = new Trapecio(altura, lado1, lado2, nombre, ladoA, ladoB);
                    area = trap.CalcularArea();
                    perimetro = trap.CalcularPerimetro();
                    break;
                case 2:
                    nombre = "Rombo";
                    System.out.println("Diagonal mayor:");
                    ladoA = sc.nextInt();
                    System.out.println("Diagonal menor");
                    ladoB = sc.nextInt();
                    Rombo rombo = new Rombo(nombre, ladoA, ladoB);
                    area = rombo.CalcularArea();
                    perimetro = rombo.CalcularPerimetro();
                    break;
                case 3:
                    nombre = "Base";
                    System.out.println("Base");
                    ladoA = sc.nextInt();
                    System.out.println("Altura");
                    ladoB = sc.nextInt();
                    Paralelogramo par = new Paralelogramo(nombre, ladoA, ladoB);
                    area = par.CalcularArea();
                    perimetro = par.CalcularPerimetro();
                    break;
                default:
                    break;
            }
            if (op!=0) {
                System.out.println("*******************");
            System.out.println("Figura:  " + nombre);
            System.out.println("Area: " + area);
            System.out.println("Périmetro: " + perimetro);
            System.out.println("*******************");
            }
            
        } while (op != 0);

    }
}
