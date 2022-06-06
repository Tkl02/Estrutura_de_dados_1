package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class fila {
    ArrayList<carro> carros = new ArrayList<>();

    void insere(carro a){
      this.carros.add(a);
    }
  
    carro remove(){
      return this.carros.remove(0);
    }
  
    boolean isEmpty(){
      return (this.carros.isEmpty());
    }
  
    int tamanho(){
      return carros.size();
    }
  
    void listar(){
      for (int i = 0; i < carros.size() ; i++) {
        this.carros.get(i).getCar();
       }
    }
  
    void ordenar(){
      ordenaPorNumero(carros);
    }
  
    private static void ordenaPorNumero(ArrayList<carro> lista) {
      Collections.sort(lista, new Comparator<carro>() {
          @Override
          public int compare(carro o1, carro o2) {
              return o1.placa.compareTo(o2.placa);
          }
       
    });
    }
}