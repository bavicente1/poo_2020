
package Tarea5;


public class Alumno {
    private String nombre;
    private double[] calificaciones ;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String Calcular(){
        double media = 0;
        for (int i = 0; i < 3; i++) {
            if (calificaciones[i] < 70) {
                return "NA";
            } 
            media = media + calificaciones[i];
        }
        
        return String.valueOf(media/3);
    }
    
}
