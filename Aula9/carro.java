package Aula9;

public class carro {
    
    String placa;
    String proprietario;
    String cor;
    
    public carro(String placa, String proprietario, String cor){
      this.placa = placa;
      this.proprietario = proprietario;
      this.cor = cor;
    }

    public carro(){};

    public void getCar(){
      System.out.println("Numero de identificação: "+ this.placa);
      System.out.println("Proprietario: "+ this.proprietario);
      System.out.println("Cor:"+ this.cor);
    }

    public String getplaca(){
      return this.placa; 
    }
}