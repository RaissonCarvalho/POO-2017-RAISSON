package terceira_questao;

public class Funcionario {
    private String nome;
    private String dataAdmissao;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String dataAdmissao, String cpf, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    public void receberAumento(double valor){
        this.salario += valor; 
    }
    
    public double calcularGanhoAnual(){
        return this.salario*12;
    }
}
