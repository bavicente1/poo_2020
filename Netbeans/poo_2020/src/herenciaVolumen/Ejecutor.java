
package herenciaVolumen;

import java.util.Scanner;


public class Ejecutor {
      public static void main(String[] args) {
       
          Scanner sc = new Scanner(System.in);
          int op = 0;
          double lado;
          
             System.out.println("PROGRAMA PARA CALCULAR EL VOLUMEN");
          do {              
              System.out.println("Elija una figura: " +
                      "\n1) Cubo " + 
                      "\n2) Cilindro " + 
                      "\n3) Cono" + 
                      "\n4) Esfera"+
                      "\n5) FIN");
              System.out.print("Opción: ");
              op = sc.nextInt();
              
              switch(op){
                  
                  case 1: 
                      System.out.print("Ingrese la arista: ");
                      lado = sc.nextInt();
                      Cubo men = new Cubo(lado);
                      System.out.println("Volumen: " + men.getVolumen());
                      break;
                  case 2:
                      System.out.println("Ingrese el radio y la altura:");
                      lado = sc.nextInt();
                      double altura = sc.nextInt();
                      Cilindro cil = new Cilindro(lado, altura);
                      System.out.println("Volumen: " +cil.getVolumen());
                      break;
                  case 3:
                      System.out.println("Ingrese el radio y la altura:");
                      lado = sc.nextInt();
                      double h = sc.nextInt();
                      Cono cono = new Cono(lado, h);
                      System.out.println("Volumen: " + cono.getVolumen());
                      break;
                  case 4:
                        System.out.print("Ingrese el radio: ");
                      lado = sc.nextInt();
                      Esfera esfera = new Esfera(lado);
                      System.out.println("Volumen: " + esfera.getVolumen());
                      break;
                  default:
                      System.out.println("Opción inválida");
                      break;
              }
          } while (op!=0);
    }
}
