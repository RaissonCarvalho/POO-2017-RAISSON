package app;

import javax.swing.JOptionPane;
import models.Split;

public class TestaSplit {
    
    public static void main(String[] args) {
        String menu = "1 - Ligar/Desligar \n"
                + "2 - Mudar função \n"
                + "3 - Aumentar temperatura \n"
                + "4 - Diminuir temperatura \n"
                + "5 - Mudar velocidade \n"
                + "6 - Oscilar \n"
                + "7 - Mostrar Estado \n\n"
                + "0 - SAIR";
        
        Split split = new Split(0, "Desligado", "Desligado", 0, "Desligado");
        
       int op = 0;
       
       do{
           op = Integer.valueOf(JOptionPane.showInputDialog(menu));
           
           switch(op){
               case 1: 
                   if(split.getModo().equals("Desligado")){
                       split.ligar();
                   }else{
                       split.desligar();
                   }
                   break;
                   
               case 2:
                   split.mudarFuncao();
                   break;
               
               case 3:
                   split.aumentarTemp();
                   break;
                   
               case 4:
                   split.diminuirTemp();
                   break;
                   
               case 5:
                   split.mudarVelocidade();
                   break;
                   
               case 6:
                   split.mudarOscilar();
                   break;
               case 7:
                   split.mostrarEstado();
                   break;
           }
       
       }while(op != 0);
       
                
    }
    
}
