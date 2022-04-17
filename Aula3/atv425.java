/*Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo
que pudesse controlar sempre um estoque mínimo de determinadas plantas,
pois todo dia, pela manhã, o dono faz novas aquisições. Criar um algoritmo que
deixe cadastrar50 tipos de plantas e nunca deixar o estoque ficarabaixo do ideal.
package Aula3;*/

import java.util.Scanner;
public class atv425 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int l;
            int[][] qtde = new int[50][3];                    ////////variaveis
            String[] nome = new String[50];
            l = 0;
            do {
                System.out.println("\n DIgite o nome da " + (l+1) + " planta: " );
                nome[l] = sc.next();
                System.out.println("\ndigite quantidade em estoque: ");
                qtde[l][0] = sc.nextInt();
                System.out.println("\ndigite quantidade ideal: ");           
                qtde[l][1] = sc.nextInt();
                                                                  //////////////////aplocaçao de variaveis
                if (qtde[l][0] < qtde[l][1]) 
                    { qtde[l] [2] = qtde[l] [1] - qtde[l] [0] ;}
                 else {
                    qtde[l][2] = 0;
                }

                l++;
            } while (l < 50);

            System.out.println("\nTotal de compras\n");              ///////////////resultado final
            l = 0;
            do {
                System.out.println( nome[l] + " - " + qtde[l][2] );
                l++;
            } while (l < 5);
        }
        System.out.println();

    }
}