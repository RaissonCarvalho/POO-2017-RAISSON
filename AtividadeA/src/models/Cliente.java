package models;

public class Cliente {
    private String nome;
    private String cpf;
    private Data dataNascimento;

    public Cliente() {
    }
    
    public Cliente(String nome, String cpf, Data dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }
    
    
}
