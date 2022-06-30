package atividade3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        boolean funcionando = true;
        
        try (Scanner sc = new Scanner(System.in)) {
            id aviao1 = new id("Aviao numero 1", 1);
            id aviao2 = new id("Aviao numero 2", 2);
            id aviao3 = new id("Aviao numero 3", 3);
            id aviao4 = new id("Aviao numero 4", 4);
            id aviao5 = new id("Aviao numero 5", 5);
            id aviao6 = new id("Aviao numero 6", 6);
            id aviao7 = new id("Aviao numero 7", 7);
            
            fila fila = new fila();
            
            fila.espera(aviao1);
            fila.espera(aviao2);
            fila.espera(aviao3);
            fila.espera(aviao4);
            fila.espera(aviao5);
            fila.espera(aviao6);
            
            while(funcionando){
                System.out.println("Qual operação deseja realizar?");
                System.out.println("(1) Listar numero de avioes \n(2) Autorizar decolagem \n" + "(3) Adicionar a fila de espera \n(4) Listar todos os avioes \n" + "(5) Mostrar dados do primeiro aviao\n(0) Parar o programa");
            
                byte opt = sc.nextByte();
                
                if(opt == 0){
                    funcionando = false;
                }
                else if(opt == 1){
                    System.out.println("O numero de avioes na fila é: " + fila.numeroDeAvioes());
                }
                else if(opt == 2){
                    id av = fila.pegarPrimeiro();
                    fila.decolar();
                    System.out.println("O aviao " + av.getNome());
                }
                else if(opt == 3){
                    fila.espera(aviao7);
                    System.out.println("Aviao adicionado a lista de espera!");
                }
                else if(opt == 4){
                    fila.listarAvioes();
                }
                else if(opt == 5){
                    fila.verPrimeiro();
                }
                
            }
        }
    }

}