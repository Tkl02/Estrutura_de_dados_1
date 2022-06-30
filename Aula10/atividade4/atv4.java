package atividade4;

import java.util.Random;
import java.util.Stack;

public class atv4 {
    public static void main(String[] args) {
        fila F1 = new fila();
        Stack<Integer> pilha = new Stack<>();
        fila F2 = new fila();
        
        Random random = new Random();
        
        byte i=0;
        
        while(F1.tamanhoFila() < 100){
            F1.push(random.nextInt(100)); 
        }
        
        while(!F1.empty()){
            pilha.push(F1.pop());
            F2.push(pilha.pop());
        }
        
        while(!F2.empty()){
            System.out.println(i + ". "+ F2.pop());
            i++;
        }
    }
}
