package models;


public class Circulo {
    private double raio;
    private double diametro;
    private int pontoX;
    private int pontoY;

    public Circulo() {
    }
    
    public Circulo(double raio, double diametro, int pontoX, int pontoY) {
        this.raio = raio;
        this.diametro = diametro;
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public int getPontoX() {
        return pontoX;
    }

    public int getPontoY() {
        return pontoY;
    }
    
    
    public void setPontoX(int pontoX) {
        this.pontoX = pontoX;
    }

    public void setPontoY(int pontoY) {
        this.pontoY = pontoY;
    }
    
    
    public double calcularArea(){
        return Math.PI*(Math.pow(raio, 2));
    }  
    
    public double calcularCircunferencia(){
        return 2*Math.PI*raio; 
    }
    
}
