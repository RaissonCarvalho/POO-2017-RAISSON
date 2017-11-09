package terceira_questao;

public class Proprietario {
    private String nome;
    private String cpf;
    private double rendaMensal;

    public Proprietario(String nome, String cpf, double rendaMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getRendaMensal() {
        return rendaMensal;
    } 
    
}
