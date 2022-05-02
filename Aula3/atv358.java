/*Criar um algoritmo que leia o preço de compra e o preço de venda de 100 mercadorias 
O algoritmo devera imprimir quantas mercadorias proporcionam
m lucro < 10 %
10 % <= lucro <= 20 %
m lucro > 20 % */


package Aula3;

import java.util.Scanner;
public class atv358 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {    ////variaveis
            int menor10 = 0;
            int menor20 = 0;
            int maior20 = 0;
            float lucro;
            float[] compra = new float[5];
            float[] venda = new float [5];
            int a = 0;

            do {
             System.out.println("Preço compra: ");   /////atribuições
                compra[a] = sc.nextFloat();
             System.out.println("Preço venda: ");
                venda[a] = sc.nextFloat();  
             a++;
            } while (a < 4);
            a = 0;
            do {
            lucro = venda[a] - compra[a];  /////calculo
            if (lucro < 0.1 * compra[a]) {
                  menor10++;
            } else if (lucro <= 0.2 * compra[a]) {
                  menor20++;
            } else {
                  maior20++;
                }
            a++;
            } while (a < 4);                       //resultados
            System.out.println("total de mercadorias com lucro < 10%:" + menor10);
            System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + menor20);
            System.out.println("total de mercadorias com lucro > 20%: "+ maior20);
        }
    }
}