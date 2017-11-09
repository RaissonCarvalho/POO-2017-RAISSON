package terceira_questao;

public class Montadora {
    private Veiculo carro;

    public Montadora(Veiculo carro) {
        this.carro = carro;
    }

    public Veiculo getCarro() {
        return carro;
    }
    
    public void montarCarro(Veiculo carro){
        Veiculo celta = new Veiculo("Branco", "Life", 2013);
    }
}
