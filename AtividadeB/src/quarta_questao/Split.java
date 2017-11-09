package quarta_questao;

public class Split {
    private String temperatura;
    private int velocidadeDoVentilador;
    private String modo;

    public Split(String temperatura, int velocidadeDoVentilador, String modo) {
        this.temperatura = temperatura;
        this.velocidadeDoVentilador = velocidadeDoVentilador;
        this.modo = modo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public int getVelocidadeDoVentilador() {
        return velocidadeDoVentilador;
    }

    public String getModo() {
        return modo;
    }
    
    public void ligar(){
        if(this.velocidadeDoVentilador <= 0)
            this.velocidadeDoVentilador++;         
    }
    
    public void aumentarVelocidade(){
        this.velocidadeDoVentilador++;
    }
    
    public void diminuirVelocidade(){
        this.velocidadeDoVentilador--;
    }
}
