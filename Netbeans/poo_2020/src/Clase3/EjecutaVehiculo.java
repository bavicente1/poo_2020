
package Clase3;

import java.util.Scanner;


public class EjecutaVehiculo {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        Vehiculo objVehiculo = new Vehiculo();
        
        System.out.println("Registro de datos para el vehóiculo competidor: \n");
        
        System.out.print("Ingrese el nombre del piloto: ");
        
        objVehiculo.setPiloto(teclado.nextLine());
        
        System.out.print("Ingrese la placa del: ");
        objVehiculo.setPlaca(teclado.nextLine());
        
        System.out.print("Ingrese la velocidad: ");
        objVehiculo.setVelocidad(teclado.nextDouble());
        
        System.out.println("Piloto: " + objVehiculo.getPiloto());
        System.out.println("Placa: " +objVehiculo.getPlaca());
        System.out.println("Velocidad: " + objVehiculo.getVelocidad() + "Km/h");
        
        Vehiculo men2 = new Vehiculo();
        men2.setPiloto("sdasd");
        System.out.println("Piloto 2 : " + men2.getPiloto());
        
    }
}
