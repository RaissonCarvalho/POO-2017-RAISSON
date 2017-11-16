package app;

import models.Circulo;
import javax.swing.JOptionPane;

public class TestaCirculo {

    public static void main(String[] args) {
        String menu = "1 - Cadastrar Circulo 1 \n"
                + "2 - Cadastrar Circulo 2 \n"
                + "3 - Verificar \n\n"
                + "0 - SAIR";
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        
        int op = 0;
        
        do{
            op = Integer.valueOf(JOptionPane.showInputDialog(menu));
            
            switch(op){
               case 1: 
                   break;
                   
               case 2:
                   
                   break;
               
               case 3:
                   
                   break;
        
        }while(op != 0);
    }
    
}
