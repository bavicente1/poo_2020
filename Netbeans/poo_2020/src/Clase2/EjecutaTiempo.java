/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2;

/**
 *
 * @author bavic
 */
public class EjecutaTiempo {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        tiempo.establecer_hora(10);
        tiempo.establecer_minutos(11);
        tiempo.establecer_segundos(30);
        
        int hr = tiempo.obtener_hora();
        System.out.println("Hora establecida: " + hr);
        tiempo.obtener_hora_actual();
    }
}
