package Aula10.atividade8;

import java.util.Stack;

public class fila {
    private Stack<Integer> N = new Stack<>();
    private Stack<Integer> P = new Stack<>();
    
    public void validar(int valor){
        if(valor>0){
            adicionarP(valor);
        }
        else if(valor<0){
            adicionarN(valor);
        }
        else if(valor==0){
            retiraEimprime();
        }
    }
    
    private void adicionarP(int valor){
        P.push(valor);
    }
    
    private void adicionarN(int valor){
        N.push(valor);
    }
    
    private void retiraEimprime(){
        System.out.println("Pilha P: " + P.pop() + "\nPilha N: " + N.pop());
    }
    
}