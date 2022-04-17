/*Criar um algoritmo que armazene dados inteiros em uma matriz de ordem cinco e
imprima:. toda a matriz e uma outra matriz formada pelos números que se encontram
 em posições cuja linha mais coluna formam um numero par */

package Aula3;

import java.util.Scanner;
public class atv412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[5][5];
        int  l = 0;
        int c = 0;
        do {
            do {
               System.out.println("Digite elemento: " + (l + 1) + " - " + (c + 1) + " : " );
               n[l][c] = sc.nextInt();
               c++; 
            } while (c < 5);
            l++;
            c=0;
        } while (l < 5);
        System.out.println("Toda Matriz\n");
        l = 0;
        do {
            do {
                System.out.print(n[l][c] + "\t");
                System.out.println();
                c++;
            } while (c < 5);
            l++;
            c = 0;
        } while (l < 5);

        System.out.println("So os elementos nas posicoes cuja linha + coluna dão um numero par" + "\n" );
        l = 0;
        do {
            do {
                System.out.print("\t");
                if ((l + c) % 2 == 0) {
                System.out.print(n[l][c]);
                 }
                System.out.print("\t");
                System.out.println();
                c++;
            } while ( c < 5);
            l++;
            c = 0;
        } while (l < 5);
      
        sc.close();

    }
}