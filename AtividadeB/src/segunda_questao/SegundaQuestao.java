package segunda_questao;

public class SegundaQuestao {
    
    public static void main(String[] args) {
        //Letra A
        int sum = 0;
        int number = 1;
        
        for (int i = 0; i <= 100; i++) {
            if(number <=100){
                sum += number;
                number += 1;
            }
        }
        
        //Fim da Letra A
        
        //Letra B
        long somatorio = 0;
        int numero = 1;
        
        while(sum <= 1000000){
            somatorio += number;
            numero++;
        }
        
    }
    
}
