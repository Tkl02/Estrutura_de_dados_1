package Aula9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        fila sujos = new fila();
        fila lavados = new fila();
        int opcao;
       
        do{
          System.out.println("-=-=-=-=-=- lava jato do jao -=-=-=-=-=-=-=-=-");
          System.out.println("1  Adicionar carro");
          System.out.println("2  mostrar lavados");
          System.out.println("3  Ordenar lavados");
          System.out.println("4  Sair");
          opcao = sc.nextInt();
    
          if (opcao == 1) {
            System.out.println("qual a placa do carro ? ");
            String plc = sc.next();
            System.out.println("proprietario ? ");
            String nome = sc.next();
            System.out.println("qual a cor do carro ? ");
            String cor = sc.next();
            if (sujos.tamanho() == 3) {
              lavados.insere(sujos.remove());
              sujos.insere(new carro(plc, nome, cor));
            }else{
              sujos.insere(new carro(plc, nome, cor));
            }
          }else if (opcao == 2) {
            lavados.listar();
          }else if(opcao == 3){
            lavados.ordenar();
          }else{
            break;
          }

        }while(true);
       sc.close();
    }
}