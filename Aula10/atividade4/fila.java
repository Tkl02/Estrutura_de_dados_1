package Aula10.atividade4;

import java.util.ArrayList;
import java.util.List;

public class fila {
    List<Integer> fila = new ArrayList<>();
    
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
}