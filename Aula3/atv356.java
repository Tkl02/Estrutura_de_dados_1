/*Armazenar nomes e notas das PR 1 e PR2 de 15 alunos. Calcular e armazenar
 a média arredondada. Armazenar também a situação do aluno: AP ou RP. Imprimir
uma listagem contendo nome notas media e situação de cada aluno tabulando*/

package Aula3;

import java.util.Scanner;

public class atv356{
    public static void main(String[] args) {
    int l =0;
    int c = 1;
    int  t = 0;

    try (Scanner sc = new Scanner(System.in)) {
        int[] media = new int[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        
        String[] nomes = new String[15];
        String[] sit = new String[15];
/////////////////////////////////////////////////////////////////////////entrada dos alunos
        do {
        System.out.print("\n Digite " + (l+1)+ " nomes:");  
        nomes[l] = sc.next();
            while ((nomes[l].length()) > 30) {
            System.out.println("Nomes com até 30 caracteres");
            System.out.println("\n Digite" + (l+1) + " nome:");
            nomes[l] = sc.next();
            }
////////////////////////////////////////////////////////////////////////// limite de caracteres
         t = 30 - nomes[l].length();
/////////////////////////////////////////////////////////////////////// atribuição de valores e media
        do {
            {nomes[l] = nomes[l].concat(" ");} 
            c++;
        } while (c <= t);
         System.out.println("Digite a primeira nota: ");
                pr1[l] =  sc.nextDouble();
         System.out.println("Digite a segunda nota: ");
                pr2[l] = sc.nextDouble();
         media[l] = (int)((pr1[l] + pr2[l])/2);
        
        System.out.println(media[l]);
        if (media[l] > 5) {
            sit[l] = "AP";
        } else {
            sit[l] = "RP"; 
        }
             
        l++;
        } while (l<= 14);
///////////////////////////////////////////////////////////////////////////resultado final
         System.out.println("RELAÇÃO FINAL");
            for ( l = 0; l <= 14; l++) {
                System.out.println((l + 1) + " - " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
            }
    }

    }
}