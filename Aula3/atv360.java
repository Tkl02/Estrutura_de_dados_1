/*Criar um algoritmo que imprima o horóscopo de várias pessoas, a partir de sua
data de nascimento (ddmm). O fim é determinado quando se digita 9999 para
data; considere que a data foi digitada corretamente. */

package Aula3;


import java.util.Scanner;
public class atv360 {
    public static void main(String[] args) {        ////////variaveis
    try (Scanner sc = new Scanner(System.in)) {
        int dia, data,  mes;
        int i = 0;
        int[] ultdia = new int[12];
        String[] signo = new String[12];    
         
        do {
         System.out.println("Digite signo");       ///////atribuição
            signo[i] = sc.next();
         System.out.println("Digite ultimo dia: ");
            ultdia[i] = sc.nextInt();
         i++;  
        } while (i < 12);
        System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
         data =  sc.nextInt();

        do {
            dia = data/100;
            mes = data % 100;                        ////////calculo
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;               //////////resultado
            }
                System.out.println("Signos : " + signo[mes] + "\n");
                System.out.println("Digite data formato ddmm ou 9999 para terminar: ");
                data = sc.nextInt();
                System.out.println();   
        } while (data != 9999);
    }

    }
}