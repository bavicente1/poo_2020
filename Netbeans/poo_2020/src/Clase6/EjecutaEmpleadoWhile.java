
//Integrantes Grupo 2
//- Joselo Ordoñez
//- Kevin Narvaez
//-Bryan Vicente
package Clase6;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {

    public static void main(String[] args) {
        String nombre;
        int horas;
        double cuota;
        char desea = 's';
        
        String texto = "   Reporte de Empleados    \n" + String.format("%-25s %5s", "Nombre" , "Sueldo") + "\n-------------------------------------\n";
        
        //Acumuladores
        double sumaSueldos = 0;
        int numTrab = 0 ;
        
        while (desea == 's') {
            numTrab++;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre del empleado");
            nombre = sc.nextLine();
            System.out.println("Ingrese el nº de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.println("Ingrese la cuota por hora ");
            cuota = sc.nextDouble();
            Empleado empleado = new Empleado(nombre, horas, cuota);
            empleado.calcularSueldo();
            sumaSueldos = sumaSueldos + empleado.getSueldo();
            texto = texto + String.format("%-25s %.2f", empleado.getNombre(), empleado.getSueldo()) + "\n";
            
            System.out.println("¿Desea ingresar otro empleado s/n?");
            desea = sc.next().toLowerCase().charAt(0);
            
        }
        
        texto = texto + "-------------------------------------\n" +String.format("%-5s  %d | %-10s  %.2f ", "Total", numTrab ,"Empleados", sumaSueldos);
        System.out.println(texto);
    }

}
