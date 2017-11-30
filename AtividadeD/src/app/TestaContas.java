package app;

import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class TestaContas {

    public static void main(String[] args) {
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);
        
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
    
}
