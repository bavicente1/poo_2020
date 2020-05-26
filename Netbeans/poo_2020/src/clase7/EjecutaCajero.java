
package clase7;

import java.util.Scanner;


public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CAJERO AUTROMÁTICO POO");
        System.out.println("Ingrese el saldo inicial de la cuenta");
        double saldo = sc.nextDouble();
        Cajero objCajero = new Cajero(saldo);
        String desea = "si";        
        do {            
            System.out.println("1) Depositor"
            +"\n2) Retirar"
            +"\n3) Consultar Saldo"
            +"\n4) Salir");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1: //Depósito
                    System.out.println("Ingrese el valor del depósito: ");
                    double deposito = sc.nextDouble();
                    objCajero.depositar(deposito);
                    break;
                case 2: //Retiro
                    System.out.println("Ingrese el valor a retirar");
                    double retiro = sc.nextDouble();
                    objCajero.retiro(retiro);
                    break;
                case 3:
                    System.out.println("El saldo de tu cuenta es: " + objCajero.consultar_saldo() + " $");
                    break;
                case 4: //Salir
                    desea = "no";
                    break;
            }
           
        } while (desea.equals("si"));
    }
}
