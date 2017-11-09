package terceira_questao;

public class Titular {
    private String cpf;
    private String dataDeNascimento;
    private String nome;

    public Titular(String cpf, String dataDeNascimento, String nome) {
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
