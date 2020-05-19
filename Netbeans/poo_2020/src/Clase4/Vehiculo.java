package Clase4;

public class Vehiculo {

    private int velocidad;
    private String piloto, placa;

    public Vehiculo() {

    }
//Inivializar valores a los atributos de la clase

    public Vehiculo(int velocidad, String piloto, String placa) {
        this.velocidad = velocidad;
        this.piloto = piloto;
        this.placa = placa;
    }
//Método para inicializar solo la placa y piloto;

    public Vehiculo(String placa, String piloto) {
        this.piloto = piloto;
        this.placa = placa;
    }

    public Vehiculo(String piloto, int velocidad) {
        this.velocidad = velocidad;
        this.piloto = piloto;
    }

    public Vehiculo(int velocidad, String placa) {
        this.velocidad = velocidad;
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
