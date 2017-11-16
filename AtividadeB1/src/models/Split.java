package models;

import javax.swing.JOptionPane;

public class Split {
    private int velocidade;
    private String oscilar;
    private String modo;
    private int temperatura;
    private String funcao;

    public Split() {
    }
    
    public Split(int velocidade, String oscilar, String modo, int temperatura, String funcao) {
        this.velocidade = velocidade;
        this.oscilar = oscilar;
        this.modo = modo;
        this.temperatura = temperatura;
        this.funcao = funcao;
    }
    

    public int getVelocidade() {
        return velocidade;
    }

    public String getOscilar() {
        return oscilar;
    }

    public String getModo() {
        return modo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getFuncao() {
        return funcao;
    }
    
    
    
    public boolean ligar(){
        if(this.modo.equals("Desligado")){
            this.modo = "Ligado";
            this.velocidade = 1;
            this.temperatura = 22;
            this.oscilar = "Ligado";
            this.funcao = "Esfriar";
            return true;
        }else{
            return false;
        }
    }
    
    public boolean desligar(){
        if(this.modo.equals("Ligado")){
            this.modo = "Desligado";
            this.velocidade = 0;
            this.temperatura = 0;
            this.oscilar = "Desligado";
            this.funcao = "Desligado";
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public boolean mudarVelocidade(){
        if(this.modo.equals("Ligado")){
            if(this.velocidade == 3)
                this.velocidade = 1;
            else
                this.velocidade++;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public boolean aumentarTemp(){
        if(this.modo.equals("Ligado")){
            this.temperatura++;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public boolean diminuirTemp(){
        if(this.modo.equals("Ligado")){
            this.temperatura--;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public boolean mudarOscilar(){
        if(this.modo.equals("Ligado")){
            if(this.oscilar.equals("Desligado")){
            this.oscilar = "Ligado";
        }else{
            this.oscilar = "Desligado";
        }
        return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public boolean mudarFuncao(){
        if(this.modo.equals("Ligado")){
            if(this.funcao.equals("Esfriar"))
            this.funcao = "Ventilar";
        else
            this.funcao = "Esfriar";
        return true;
        }else{
            JOptionPane.showMessageDialog(null, "Aparelho Desligado");
            return false;
        }
    }
    
    public void mostrarEstado(){
        JOptionPane.showMessageDialog(null, "Modo: " +getModo() + "\nTemperatura: " +getTemperatura() + "\nVelocidade: " +getVelocidade() + "\nOscilar: " +getOscilar() + "\nFunção: " +getFuncao());
    }
    
}
