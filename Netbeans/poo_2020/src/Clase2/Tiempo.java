/*
 *Clase Tiempo, para poder obtener la hora
 */
package Clase2;

/**
 *
 * @author bavic
 */
public class Tiempo {

    //Atributos, características o propiedades de la clase tiempo
    private int hora;
    private int minuto;
    private int segundo;

    //Vamos a encapsular los atributos con ayuda de los métodos.
    //GETTERS
    public int obtener_hora() {
        return hora;
    }


    public int obtener_minuto() {
        return minuto;
    }


    public int obtener_segundo() {
        return segundo;
    }

    //SETTERS
    public void establecer_hora(int hora) {
        this.hora = hora;
    }

    public void establecer_minutos(int minutos) {
        this.minuto = minutos;
    }

    public void establecer_segundos(int segundos) {
        this.segundo = segundos;
    }

    
    /////
    public void obtener_hora_actual() {
        String hora_completa = hora + ":" + minuto + ":" + segundo;
        System.out.println("Hora actual: " + hora_completa);
    }

}
