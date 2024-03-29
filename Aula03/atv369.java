/*Criar um algoritmo para gerenciar um sistema de reservas de mesas em uma casa
de espetáculo.
A casa possui 30 mesas de 5 lugares cada. O algoritmo deverá permitir que o
usuário escolha código de uma mesa (100 a 129) e forneça a quantidade de lugares desejados. O algoritmo deverá informarse foi possível realizara reserva e atualizar a reserva. Se não for possível, o algoritmo deverá emitir uma mensagem. O
algoritmo deve terminar quando o usuário digitar o código O (zero) para uma
mesa ou quando todos os 150 lugares estiverem ocupados. */

package Aula03;

import java.util.Scanner;

public class atv369 {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      int lugares, codigo, lugmesa;
       int[] mesa = new int[30];
       int[] qtde = new int[30];
       int a = 0;
       int z = 0;
      do {
          mesa[a] = 100 + a;
          qtde[a] = 5;
          a++;    
       } while (a < 30);

       lugares = 150;
       System.out.println("Entre com codigo (100 - 129) ou O para terminar: ");
       codigo = sc.nextInt();
       
       while (codigo > 0 && lugares != 0) {
           a = 0;
 
          while (codigo != mesa[a] && a < 29) {
            a++;
          }
 
          if (codigo == mesa[a]) {
            System.out.print("Quantos lugares você quer reservar? ");
            lugmesa = sc.nextInt();
 
            if (qtde[a] >= lugmesa) {
              qtde[a] -= lugmesa;
              lugares -= lugmesa;
            } else {
              System.out.println("Não há lugares para reservar.");
            }
 
          } else {
            System.out.println("Código de mesa inválido.");
 
          }
 
          System.out.print("Entre com um codigo entre 100-129 ou 0 para desligar o programa: ");
          codigo = sc.nextInt();
        }
 
        if (lugares == 0) {
          System.out.println("Lotação esgotada.");
        } else {
 
          System.out.println("Lugares Vagos");
 
          while (z < 30) {
 
            if (qtde[z] != 0) {
              System.out.println("Mesa: " + mesa[z] + "\t" + "Total de Lugares:" + qtde[z]);
            }
 
            z++;
          }
        }
    }
    }
}