package terceira_questao;

public class Veiculo {
    private String cor;
    private String modelo;
    private int ano;
    private double velocidade;

    public Veiculo(String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }
 
    public void acelerar(){
        velocidade++;
    }
    
    public void frear(){
        velocidade--;
    }
}
