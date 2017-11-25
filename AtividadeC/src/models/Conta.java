package models;
import javax.swing.JOptionPane;

public class Conta {
    private Cliente titular;
    private int numero;
    private String tipo;
    private double saldo;

    public Conta() {
    }
    
    public Conta(Cliente titular, int numero, String tipo, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor >= this.saldo){
            saldo -= valor;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            return false;        
        }
    }
    
    public boolean depositar(double valor){
        if(valor>=0){
            saldo += valor;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Valor não disponível");
            return false;
        }
    }
    
    public boolean transferir(double valor, Conta contaDestino){
        if(sacar(valor)){
            sacar(valor);
            contaDestino.depositar(valor);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            return false;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }
    
    
}
