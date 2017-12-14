package models;

public class Banco {
    
    private Conta[] contas = new Conta[10];
    private int pos = 0;
    
    public boolean adiciona(ContaCorrente conta){
        if(pos != this.contas.length){
            this.contas[pos] = conta;
            pos++;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean adiciona(ContaPoupanca conta){
        if(pos != this.contas.length){
            this.contas[pos] = conta;
            pos++;
            return true;
        }else{
            return false;
        }
    }
    
    public double pegaConta(int x){
        double valor = 0;
        for (Conta conta : contas) {
            if (contas[x] == conta) {
                valor = conta.getSaldo();
            }
        }
        return valor;
    }
    
    public int totalDeContas(){
        int totalContas = 0;
        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null)
                totalContas++;
        }
        return totalContas;
    }
}
