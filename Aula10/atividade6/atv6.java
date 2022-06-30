package atividade6;

import java.util.Random;
import java.util.Stack;

public class atv6 {
    public static void main(String[] args) {
        fila fila = new fila();
        Stack<Integer> pilha = new Stack<>();
        Random rdm = new Random();
        
        int i=0;
       
        while(i<1000){
            int numAleatorio = rdm.nextInt();
            if(numAleatorio >= 0){
                fila.push(numAleatorio);
                i++;
            }
        }
        
        i=0;
        
        while(i<1000){
            int numAleatorio = rdm.nextInt();
            if(numAleatorio < 0){
                fila.push(numAleatorio);
                i++;
            }
        }
        
        i=0;
        
        while(!fila.empty()){
            if(fila.peek() > 0){
                pilha.push(fila.pop());
            }
            else{
                System.out.println(i + ". " + pilha.pop());
                i++;
                fila.pop();
            }
            
        }
    }

}