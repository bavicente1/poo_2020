package Tarea5;

public class Grados {

    private double f, c, k, r;

    public void setF(double f) {
        this.f = f;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getF() {
        return f;
    }

    public double getC() {
        return c;
    }

    public double getK() {
        return k;
    }

    public double getR() {
        return r;
    }
    
    

    public void calcular(int opcion) {
        switch (opcion) {
            case 1:
                //Con C
                f = ((c * 5) / 9) + 32;
                k = c + 273;
                r = f + 460;
                break;
            case 2:
                //con f
                c = ((f - 32) * 5) / 9;
                k = c + 273;
                r = f + 460;
                break;
            case 3:
                //con k
                c = k - 273;
                f = ((c * 5) / 9) + 32;
                r = f + 460;
                break;
            case 4:
                //con r
                f = r - 460;
                c = ((f - 32) * 5) / 9;
                k = c + 273;
                break;
        }

    }

}
