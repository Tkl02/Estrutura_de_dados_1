package Aula10.atividade8;

import java.util.Random;

public class atv8 {
    public static void main(String[] args) {
        fila pilha = new fila();
        Random rdm = new Random();
        
        for(int i=0; i<1000; i++){
            pilha.validar(rdm.nextInt(-100, 100));
        }
    }
}