/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_gui;

import java.util.Scanner;

/**
 *
 * @author bavic
 */
public class EjecutaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;
        System.out.println("PROGRAMA PARA CALCULAR ÁREA DE TRIÁNGULO");
        System.out.println("Ingrese base:");
        base = sc.nextDouble();
        System.out.println("Ingrese altura");
        altura = sc.nextDouble();
        
        Triangulo men = new Triangulo(base, altura);
        
        System.out.println("El Área es:  " + men.calcularArea());
    }
}
