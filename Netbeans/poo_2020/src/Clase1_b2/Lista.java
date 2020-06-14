
package Clase1_b2;

import java.util.ArrayList;
import java.util.List;


public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        System.out.println("Tamaño actual de la lista: "  + lista.size());
        lista.add("Bryan");  
        lista.add("Carlos");  
        lista.add("Kevin");  
        lista.add("Joselito");  
        lista.add("Andres");  
        
         System.out.println("Tamaño actual de la lista: "  + lista.size());
         System.out.println("Eliminamos posicion 2");
         lista.remove(2);
          System.out.println("Tamaño actual de la lista: "  + lista.size());
          System.out.println("Valor en la posición 2" + lista.get(2));
          
          System.out.println("Mostrar los elementos: ");
      /*    for (int i = 0; i < lista.size(); i++) {
              System.out.println(lista.get( i));
        }*/
      for(String nom : lista){
          
      }
    }
}
