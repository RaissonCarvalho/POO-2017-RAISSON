package app;

import models.Empresa;
import models.Funcionario;

public class TestaEmpresa {
   
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Ana");
        
        Funcionario f2 = new Funcionario();
        f2.setNome("José");
        
        Empresa empresa = new Empresa("124.487.554-10", "Empresa");
       
        empresa.adicionaFuncionario(f1);
        empresa.adicionaFuncionario(f2);
        
        empresa.mostraEmpregados();
        
        empresa.contem(f1);       
    }
    
}
