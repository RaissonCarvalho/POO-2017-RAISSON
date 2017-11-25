package models;

public class Empresa {
    private String cnpj;
    private String nome;
    private Funcionario[] funcionarios = new Funcionario[10];
    private int pos = 0;

    public Empresa() {
    }
    
    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    
    public void adicionaFuncionario(Funcionario funcionario){
        if(pos != this.funcionarios.length){
            this.funcionarios[pos] = funcionario;
            pos++;
            System.out.println("Funcionario adicionado");
        }else{
            System.out.println("Lista de funcionarios cheia");
        }
    }
    
    public void mostraEmpregados(){
        for (int i = 0; i < pos; i++) {
            System.out.println("Funcionario na posição: "+i);
            System.out.println("Nome: "+funcionarios[i].getNome());
            System.out.println("Salário: "+funcionarios[i].getSalario());
            System.out.println("Data de entrada: "+funcionarios[i].getDataEntrada());
            System.out.println("RG: "+funcionarios[i].getRg());
        }
    }
    
    public void contem(Funcionario f){
        for (int i = 0; i < pos; i++) {
            if(this.funcionarios[i] == f){
                System.out.println("Contém");
            }else{
                System.out.println("Não contéAaaaaam");
            }
        }
    }
    
}
