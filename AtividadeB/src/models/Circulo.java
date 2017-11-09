package models;

public class Circulo {
    
    private Ponto ponto;
    private double raio;
    private double diametro;
    
    private final double PI = 3.14;

    public Circulo(Ponto ponto, double raio, double diametro) {
        this.ponto = ponto;
        this.raio = raio;
        this.diametro = diametro;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public double getRaio() {
        if(this.raio <=0){
            this.raio = 1;
            return raio;
        }
        else
            return raio;
    }

    public double getDiametro() {
        return diametro;
    }
    
    public double calcularCircunferencia(Circulo circulo){
        return 2*PI*circulo.getRaio();
    }
    
    public double calcularArea(Circulo circulo){
        return PI*Math.pow(getRaio(), 2);
    }
    
    public void movimentarCirculo(){
        int novoPontoX = getPonto().getX();
        novoPontoX += 1;
        
        int novoPontoY = getPonto().getX();
        novoPontoY += 1; 
    }
}
