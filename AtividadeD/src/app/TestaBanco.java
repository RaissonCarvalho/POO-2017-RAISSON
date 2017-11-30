package app;

import models.Banco;
import models.ContaCorrente;
import models.ContaPoupanca;

public class TestaBanco {

    public static void main(String[] args) {
        
        Banco b1 = new Banco();
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        
        corrente.depositar(100);
        
        b1.adiciona(corrente);
        b1.adiciona(poupanca);
        
        System.out.println(b1.totalDeContas());
        System.out.println(b1.pegaConta(0));
       
    }
    
}
