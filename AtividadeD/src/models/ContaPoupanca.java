package models;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() {
    }
    
    public ContaPoupanca(double saldo) {
        super(saldo);
        this.saldo = saldo;
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa);
        this.saldo += this.saldo * taxa * 3;
    }
    
    
    
}
