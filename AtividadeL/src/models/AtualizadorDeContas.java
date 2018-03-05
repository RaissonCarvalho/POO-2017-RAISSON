package models;

public class AtualizadorDeContas {
    
    private double selic;
    private double saldoTotal = 0;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
            
    public void roda(Conta conta){
        System.out.println("Saldo:" +conta.getSaldo());
        conta.atualiza(selic);
        this.saldoTotal += conta.getSaldo() + saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
        
}
