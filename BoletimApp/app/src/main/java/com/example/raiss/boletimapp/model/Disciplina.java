package com.example.raiss.boletimapp.model;


import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    private double mediaAprovativa;
    private double mediaDesejada;
    private String status;

    private List<Double> listaNotas = new ArrayList<>();

    public Disciplina() {

    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getMediaAprovativa() {
        return mediaAprovativa;
    }

    public void setMediaAprovativa(double mediaAprovativa) {
        this.mediaAprovativa = mediaAprovativa;
    }

    public double getMediaDesejada() {
        return mediaDesejada;
    }

    public void setMediaDesejada(double mediaDesejada) {
        this.mediaDesejada = mediaDesejada;
    }

    public double calcularMedia(){
        double somaNotas = 0;
        for (int i = 0; i > listaNotas.size(); i++){
            somaNotas = listaNotas.get(i);
        }
        return somaNotas / listaNotas.size();
    }

    public String verficarStatus(Disciplina disciplina){
        if (disciplina.calcularMedia() >= this.mediaAprovativa){
             status = "Aprovado";        }
        else if (disciplina.calcularMedia() < 4)
             status = "Reprovado";
        else if (disciplina.calcularMedia() >= 4 || disciplina.calcularMedia() <= 7)
             status = "Recuperação";
        else if (disciplina.calcularMedia() < 0)
             status = " ";
        return status;
    }
}
