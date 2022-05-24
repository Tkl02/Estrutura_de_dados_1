package test;

import javax.swing.JOptionPane;

public class test {

        String pilha[] = new String[100];
        int topopilha = -1;
        String s;

        int tamanho(){
            return(this.topopilha+1); // retorna a quantidade de elementos presentes na pilha
        }
        int push(int topo, String s){
            this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 99){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha]=s;
            System.out.println("Inserindo o elemento..: "+s);
            return(this.topopilha);
        }
        }
    
    String pop(int topo){
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha<-1){
           JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
           return("-997");
        }else{
            System.out.println("Retirando o valor ..: "+this.pilha[this.topopilha+1]);
            return(this.pilha[this.topopilha+1]);
        }

}
    public static Object pilha() {
        return null;
    }
    public Object push(Object topo, String s1) {
        return null;
    }
}