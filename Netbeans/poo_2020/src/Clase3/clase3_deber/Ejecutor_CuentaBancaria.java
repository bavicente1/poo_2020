package Clase3.clase3_deber;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejecutor_CuentaBancaria {

    private static CuentaBancaria cb = new CuentaBancaria();
    private static CuentaBancaria cb2 = new CuentaBancaria();

    public static void main(String[] args) {
        ingresoDatos();
   
        MostrarCuentas();
        
    }

    public static void ingresoDatos() {
        Scanner sc = new Scanner(System.in);
        //PRIMERA CUENTA
        System.out.println("*Ingrese la 1ra cuenta*\n");
        System.out.print("Nº de cuenta: ");
        cb.setnCuenta(sc.nextLine());
        System.out.print("Saldo: ");
        cb.setSaldo(sc.nextDouble());
        sc.nextLine();
        System.out.print("Ingrese el nombre del socio: ");
        cb.setNombreSocio(sc.nextLine());
        //SEGUNDA CUENTA
        System.out.println("\n*Ingrese la 2da cuenta*\n");
        System.out.print("Nº de cuenta: ");
        cb2.setnCuenta(sc.nextLine());
        System.out.print("Saldo: ");
        cb2.setSaldo(sc.nextDouble());
        sc.nextLine();
        System.out.print("Ingrese el nombre del socio: ");
        cb2.setNombreSocio(sc.nextLine());
    }
    
    private static void MostrarCuentas(){
        
        String cuenta1 = "CUENTA Nº1 \n"+ "Nº de Cuenta: " + cb.getnCuenta() + "\nNombre del socio: "+cb.getNombreSocio() + "\nSaldo: " + cb.getSaldo() + "$";
        String cuenta2 = "CUENTA Nº2 \n"+ "Nº de Cuenta: " + cb2.getnCuenta() + "\nNombre del socio: "+cb2.getNombreSocio() + "\nSaldo: " + cb2.getSaldo() +"$";
        
        JOptionPane.showMessageDialog(null, cuenta1);
        JOptionPane.showMessageDialog(null, cuenta2);
    }
}
