/*A matriz dados contém na 1 coluna a matrícula do aluno; na 2, o sexo (0 para
feminino e 1 para masculino); na 3 o código do curso, e na 4 o CR.
Faça um algoritmo que armazene esses dados sabendo-se que:
E o código do curso e uma parte da matrícula: aascccnnn (aa ano, s
semestre, ccc código do curso e nnn matrícula no curso)
Um grupo empresarial resolveu premiar a aluna com CR mais alto de um curso
cujo código deverá ser digitado. Suponha 10 alunos e que o CR é um n2inteiro.*/

package Aula3;

import java.util.Scanner;
public class atv428 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] dados = new int[10][4];
            int l = 0;
            int codigo;
            int pos = 0;
            int aux;
            while (l < 10) {
                System.out.println("Digite a matricula no formato aascccnnn: ");
                dados[l][0] = sc.nextInt();
                aux = dados[l][0]/1000000;
                aux = dados[l][0] - aux * 1000000;
                dados[l][2] = aux/1000;
                System.out.println("\ndigite sexo (0 fem 1 masc): ");
                dados[l][1] = sc.nextInt();
                System.out.println("\ndigite CR do aluno: ");
                dados[l][3] = sc.nextInt();
                l++;  
            }
            System.out.println("Digite o codigo do curso: ");
            codigo = sc.nextInt();
            l=0;
            while (l < 10) {
                if (dados[l][2]==codigo && dados[l][1]==0) {
                    pos = l;
                } else {
                    if (dados [l] [3] >dados [pos][3]) {
                        pos = l;
                    }
                }
                l++; 
            }
        }

    }
}