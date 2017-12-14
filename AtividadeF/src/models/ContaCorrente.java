package models;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(){
    }

    public ContaCorrente(double saldo) {
        super(saldo);
        this.saldo = saldo;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    } 

    @Override
    public boolean depositar(double valor) {
        if(valor>=0){
            saldo += valor - 0.10;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Valor não disponível");
            return false;
        }
    }
    
    
    
}
