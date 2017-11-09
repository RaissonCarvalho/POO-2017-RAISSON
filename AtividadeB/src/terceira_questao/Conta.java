package terceira_questao;

public class Conta {
    private double saldo;
    private int numero;
    private Titular titular;

    public Conta(double saldo, int numero, Titular titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
