package Aula10.atividade7;

import java.util.Random;

public class at7 {
    public static void main(String[] args) {
        fila fila = new fila();
        Random rdm = new Random();
        fila filaInvertida = new fila();

        for(int i=0; i<20; i++){
            fila.push(rdm.nextInt());
        }
        

        System.out.println("Fila antes de ser invertida:");
        while(!fila.empty()){
            filaInvertida.push(fila.peek());
            System.out.println(fila.pop());
        }
        
        filaInvertida.inverterFila();
        
        System.out.println("\nFila Invertida:");
        while(!filaInvertida.empty()){
            System.out.println(filaInvertida.pop());
        }
    }

}