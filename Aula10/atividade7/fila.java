package Aula10.atividade7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class fila {
    private List<Integer> fila = new ArrayList<>();
    private Stack<Integer> inversorDeFila = new Stack<>();
    
    public void push(int numero){
        fila.add(numero);
    }
    
    public int pop(){
        int removido = fila.get(0);
        fila.remove(0);
        return removido;
    }
    
    public boolean empty(){
        return fila.isEmpty();
    }
    
    public int tamanhoFila(){
        return fila.size();
    }
    public boolean procurarNaFila(int valor){
        return fila.contains(valor);
    }
    
    public int peek(){
        return fila.get(0);
    }
    
    public void inverterFila(){
        while(!fila.isEmpty()){
            inversorDeFila.push(fila.get(0));
            fila.remove(0);
        }
        while(!inversorDeFila.empty()){
            fila.add(inversorDeFila.pop());
        }
    }
}