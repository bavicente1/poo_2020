package Clase3.clase3_deber;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutor_Vehiculo {

    private static Vehiculo vehiculo1 = new Vehiculo();
    private static Vehiculo vehiculo2 = new Vehiculo();

    public static void main(String[] args) {
        IngresarDatos();
        MostarDatos();
    }

    public static void IngresarDatos() {
        Scanner sc = new Scanner(System.in);

        //1er Vehiculo
        System.out.println("*INGRESE EL 1ER VEHÍCULO*\n");
        System.out.print("Ingrese la Matrícula: ");
        vehiculo1.setMatricula(sc.nextLine());
        System.out.print("Ingrse la Marca: ");
        vehiculo1.setMarca(sc.nextLine());
        System.out.print("Ingrese el Modelo: ");
        vehiculo1.setModelo(sc.nextLine());
        System.out.print("Ingrese el Precio: ");
        vehiculo1.setPrecio(sc.nextDouble());
        sc.nextLine();
        //2Do Vehiculo
        System.out.println("\n*INGRESE EL 2DO VEHÍCULO*\n");
        System.out.print("Ingrese la Matrícula: ");
        vehiculo2.setMatricula(sc.nextLine());
        System.out.print("Ingrse la Marca: ");
        vehiculo2.setMarca(sc.nextLine());
        System.out.print("Ingrese el Modelo: ");
        vehiculo2.setModelo(sc.nextLine());
        System.out.print("Ingrese el Precio: ");
        vehiculo2.setPrecio(sc.nextDouble());
    }
    
    public static void MostarDatos(){
        String v1 = "VEHICULO 1\n" + "\nMatrícula: " + vehiculo1.getMatricula()+"\nMarca: "+ vehiculo1.getMarca() +
                "\nModelo: " + vehiculo1.getModelo() + "\nPrecio: " + vehiculo1.getPrecio();
        
        String v2 = "VEHICULO 2\n" + "\nMatrícula: " + vehiculo2.getMatricula()+"\nMarca: "+ vehiculo2.getMarca() +
                "\nModelo: " + vehiculo2.getModelo() + "\nPrecio: " + vehiculo2.getPrecio();         
        
        JOptionPane.showMessageDialog(null, v1);
        JOptionPane.showMessageDialog(null, v2);
    }
}
