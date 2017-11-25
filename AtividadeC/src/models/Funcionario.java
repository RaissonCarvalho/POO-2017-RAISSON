package models;

public class Funcionario {
    private String nome;
    private double salario;
    private Data dataEntrada;
    private String rg;

    public Funcionario() {
    }
    
    public Funcionario(String nome, double salario, Data dataEntrada, String rg) {
        this.nome = nome;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }  

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    public boolean receberAumento(double valor){
        if(valor > 0){
            this.salario += valor;
            return true;
        }else{
            return false;
        }
    }
    
    public double calcularGanhoAnual(){
        return this.salario*12;
    }    
    
}
