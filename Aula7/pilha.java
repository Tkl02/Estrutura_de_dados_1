package Aula7;

import javax.swing.JOptionPane;

public class pilha{
public static void main(String[] args) {
    int[] pilha = new int[20]; //estrutura da pilha
    int topopilha = -1; //indicar o topo da pilha
    
    //método para esfaziar a pilha
    void esvaziePilha(){
        this.topopilha = -1; //quando o topo está em -1, a pilha está vazia
    }
    
    //retornar o tamanho tamanho
    int tamanho(){
        return(this.topopilha+1); // retorna a quantidade de elementos presentes na pilha
    }
    
    //Imprime a pilha
    void imprimir(int topo){
        for(int i=topo; i>0; i--){
            System.out.println("Valor na pilha..: "+this.pilha[i]);
        }
    }
    
    //insere elementos na pilha
    int push(int topo, int num){
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 9){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha]=num;
            System.out.println("Inserindo o elemento..: "+num);
            return(this.topopilha);
        }
    }
    
    //retirar elementos da pilha
    int pop(int topo){
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha<-1){
           JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
           return(-997);
        }else{
            System.out.println("Retirando o valor ..: "+this.pilha[this.topopilha+1]);
            return(this.pilha[this.topopilha+1]);
        }
            
    }
    
    //Verifica o topo da pilha
    int top(int topo){
        this.topopilha = topo;
        
        if(this.topopilha <0){
            JOptionPane.showMessageDialog(null,"Pilha Vazia! Erro: -998");
            return(-998);
        }else{
            return(this.pilha[this.topopilha]);
        }
    }
     
}
}