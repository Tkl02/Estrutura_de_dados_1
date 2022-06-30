package Aula10.atividade3;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        
        boolean funcionando = true;
        
        try (Scanner sc = new Scanner(System.in)) {
            Aviao aviao1 = new Aviao("Aviao 1", 1);
            Aviao aviao2 = new Aviao("Aviao 2", 2);
            Aviao aviao3 = new Aviao("Aviao 3", 3);
            Aviao aviao4 = new Aviao("Aviao 4", 4);
            Aviao aviao5 = new Aviao("Aviao 5", 5);
            Aviao aviao6 = new Aviao("Aviao 6", 6);
            Aviao aviao7 = new Aviao("Aviao 7", 7);
            
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
                    Aviao av = fila.pegarPrimeiro();
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