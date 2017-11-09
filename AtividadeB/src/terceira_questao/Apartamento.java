package terceira_questao;

public class Apartamento {
    private double tamanho;
    private String localizacao;
    private Proprietario dono;
    private String dataDaCompra;
    private double valor;

    public Apartamento(double tamanho, String localizacao, Proprietario dono, String dataDaCompra, double valor) {
        this.tamanho = tamanho;
        this.localizacao = localizacao;
        this.dono = dono;
        this.dataDaCompra = dataDaCompra;
        this.valor = valor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public Proprietario getDono() {
        return dono;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public double getValor() {
        return valor;
    }
    
    public boolean isVendido(Proprietario dono){
        if(dono == null)
            return false;
        else
            return true;
    }
}
