package models;

import javax.swing.JOptionPane;

public abstract class Conta {
    
    protected double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
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

    public double getSaldo() {
        return saldo;
    }
    
    public abstract void atualiza(double taxa);
}
