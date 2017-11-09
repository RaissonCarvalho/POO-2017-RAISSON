package terceira_questao;

public class Cargo {
    private String tipo;
    private Funcionario funcionario;

    public Cargo(String tipo, Funcionario funcionario) {
        this.tipo = tipo;
        this.funcionario = funcionario;
    }

    public String getTipo() {
        return tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    
}
