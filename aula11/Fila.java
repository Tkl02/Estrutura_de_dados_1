package Aula11;

import java.util.ArrayList;
import java.util.Random;

public class Fila {

    public static void main(String [] args){
        Fila naoAtendidas = new Fila();
        Fila atendidas = new Fila();
        Random gerador = new Random();
        ArrayList<String> sexos = new ArrayList<String>();
        sexos.add("Masculino");
        sexos.add("Feminino");
        int id = 1;
        for (int i = 0; i < 10; i++) {
                for(int h = 0; h < 5; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(59)+1;
                    naoAtendidas.inserirInicio(id, sexo, idade, false, false, false, 0);
                    id++;
                }
                for(int h = 0; h < 3; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(60)+60;
                    naoAtendidas.inserirInicio(id, sexo, idade, false, false, false, 1);
                    id++;
                }
                String sexo = sexos.get(gerador.nextInt(2));
                int idade = gerador.nextInt(59)+1;
                naoAtendidas.inserirInicio(id, sexo, idade, false, false, true, 2);
                id++;
                sexo = sexos.get(1);
                idade = gerador.nextInt(41)+8;
                naoAtendidas.inserirInicio(id, sexo, idade, true, true, false, 3);
                id++;
                naoAtendidas = ordenar(naoAtendidas);
                for (int f = 0; f <= i ; f++) {
                    Celula atendido = naoAtendidas.retirarInicio();
                    atendidas.inserirFim(atendido.id, atendido.sexo, atendido.idade, atendido.gestante, atendido.lactante, atendido.necessidadeEspecial, atendido.prioridade);
                }
            } 
            
        System.out.println("Pessoas atendidas========"+ atendidas); 
        System.out.println("Pessoas não atendida====="+ naoAtendidas);     
    }
    public static Fila ordenar(Fila naoAtendidas){
        if (naoAtendidas.tamanho > 1) {
            for (int k = 1; k < naoAtendidas.tamanho; k++) {
                if (naoAtendidas.selecionarIndice(k).prioridade >
                    naoAtendidas.selecionarIndice(k - 1).prioridade ) {
                    Celula aux = new Celula();
                    Celula aux2 = new Celula();
                    aux = naoAtendidas.selecionarIndice(k-1);
                    aux2 = naoAtendidas.selecionarIndice(k);
                    naoAtendidas.inserirIndice(k-1, aux2.id, aux2.sexo, aux2.idade, aux2.gestante, aux2.lactante, aux2.necessidadeEspecial, aux2.prioridade);
                    naoAtendidas.inserirIndice(k, aux.id, aux.sexo, aux.idade, aux.gestante, aux.lactante, aux.necessidadeEspecial, aux.prioridade);
                    naoAtendidas.retirarIndice(k-1);
                    naoAtendidas.retirarIndice(k-1);
                    return naoAtendidas;
                }
            }
        }
        return naoAtendidas;
    }

    Celula inicio = null;
    int tamanho = 0;

    public void inserirInicio(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        Celula Celula = new Celula(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        Celula.proximo = inicio;
        inicio = Celula;
        tamanho++;
    }

    public Celula retirarInicio(){
        if (inicio == null) {
            return null;
        }
        Celula aux = inicio;
        inicio = inicio.proximo;
        tamanho--;
        return aux;
    }

    public void inserirFim(int id, String sexo, int idade,  boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        Celula Celula = new Celula(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        if (inicio == null) {
            Celula.proximo = null;
            inicio = Celula;
        }else{
            Celula local = inicio;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = Celula;
            Celula.proximo = null;
        }
        tamanho++;
    }

    public Celula retirarFim(){
        if (inicio == null) {
            return null;
        }
        Celula local = inicio;
        while (local.proximo != null){
            Celula aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return local;
            }
        }
        inicio = null;
        tamanho--;
        return null;
    }

    public void inserirIndice(int indice, int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        if (indice <= 0) {
            inserirInicio(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else if(indice >= tamanho){
            inserirFim(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else{
            Celula local = inicio;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            Celula Celula  = new Celula(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
            Celula.proximo = local.proximo;
            local.proximo = Celula;
            tamanho++;
        }
    }
    public Celula selecionarIndice(int indice){
        Celula local = inicio;
        for (int i = 0; i < indice - 1; i++) {
            local = local.proximo;
        }
        return local;
    }

    public Celula retirarIndice(int indice){
        if (indice < 0 || indice >= tamanho || inicio == null){
            return null;
        }else if (indice == 0) {
            return retirarInicio();
        }else if(indice == tamanho -1){
            return retirarFim();
        }
        Celula local = inicio;
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        local.proximo = local.proximo.proximo;
        return local;
    }
    public String toString(){
        String str = "";
        Celula local  = inicio;
        while (local != null) {
            str += "\nID: "+ local.id+
                   "\nNivel de prioridade: "+ local.prioridade;
            local = local.proximo; 
        }
        return str;
    }
}