package Aula3;

import java.util.Scanner;
public class atv400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k, codi, codigo = 1;
        int  i, quantidade, aux, auxcodigo, total = 0;
        float venda, geral, auxp, totalpreco = 0;

        int[] cod = new int[50];
        int[] quant = new int[50];
        float[] preco = new float[50];
        k = 0;
        geral = 0;

        System.out.println("Digite o codigo do produto ou 0 para encerrar: ");
        codi = sc.nextInt();
        do {
             cod[k] = codi;
            System.out.println("Digite a quantidade de produtos: ");
             quant[k] = sc.nextInt();
            System.out.println("Digite o preço do produto: ");
             preco[k] = sc.nextFloat();
            System.out.println("Digite o codigo do produto ou 0 para encerrar: ");
             codi = sc.nextInt();
             k++;
        } while (k < 50 && codi != 0 && codi > 0);
        //SISTEMA DE VENDAS
        System.out.println("<<< Sistema de compras >>>  ");
        codigo = 1;
        int z = 0;
        do {
            System.out.println("Digite o codigo do produto a ser comprado ou 0 pra encerrar: ");
            codigo =  sc.nextInt();
            if(codigo == 0) break;

        
            if (codigo == cod[z]) {
                System.out.println(" Qual a quantidade que gostaria de comprar: ");
                quantidade = sc.nextInt();
             if (quantidade <= quant[z] ) {
                 quant[z] -= quantidade;
                 total += quantidade;
                 totalpreco += quantidade * preco[z];
             } else {
                 System.out.println("!!! Estoque insuficiente !!!");
             }

             } else {
                System.out.println(" Produto não cadastrado! ");
            }

            z++;
        } while (z <= cod.length && codigo > 0);
        //Invesão de valores
        int  j = 0;
        int j2 = 0;
        do {
            do {
                if (quant[j] < quant[j2]) {
                    aux = quant[j];
                    quant[j2] = quant[j];
                    quant[j2] = aux;

                    auxp = preco[j];
                    preco[j] = preco[j2];
                    preco[j2] = auxp;
                    
                    auxcodigo = cod[j];
                    cod[j] = cod[j2];
                    cod[j2] = auxcodigo;
                }
                j2++;
            } while (j2 < cod.length);
            j2 = 0;
            j++;
        } while (j < cod.length);
     int c = 0;
     do {
        System.out.println("Codigo: " + cod[c] + "  " + "Preço: " +preco[c]+ "  " + "Quantidade: " + quant[c]);
        c++;
     } while (c < cod.length);
        System.out.println("Total  vendido: " + totalpreco);
        System.out.println("Total de quantidade" + total);


     sc.close();

    }
}