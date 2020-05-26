
package clase7;


public class Cajero {
    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void retiro(double retiro){
        if (saldo >= retiro && retiro > 0) {
            saldo = saldo - retiro;
        }
              
    }
    
    public double consultar_saldo(){
        return saldo;
    }
}
