
/*
Clase Para registrar los datos de los vehículos en una carrera.
*/

package Clase3;

public class Vehiculo {
   
    private double velocidad;
    private String placa, piloto;

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad > 0 && velocidad <= 300) {
            this.velocidad = velocidad;
        } else {
            System.out.println("Velocidad incorrecta");
        }
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
}
