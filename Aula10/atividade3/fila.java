package Aula10.atividade3;

import java.util.ArrayList;
import java.util.List;

public class fila {
    List<Aviao> fila = new ArrayList<>();
    
    public void espera(Aviao a){
        fila.add(a);
    }
    
    public void decolar(){
        fila.remove(0);
    }
    
    public int numeroDeAvioes(){
        return fila.size();
    }
    
    public void listarAvioes(){
        for(int i=0; i<fila.size()-1; i++){
            Aviao av = fila.get(i);
            System.out.println(av.getNome());
        }
    }
    
    public void verPrimeiro(){
        Aviao av = fila.get(0);
        System.out.println("Aviao: " + av.getNome() + "\nNumero de identificacao: " + av.getNumeroIdentificador());
    }
    
    public Aviao pegarPrimeiro(){
        Aviao av = fila.get(0);
        return av;
    }
}