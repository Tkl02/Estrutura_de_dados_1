package Aula13.jogoDeParenteses;

public class struct {
  private char parentese;
  private struct anterior;

  public struct(){}
 
  public struct(char parentese, struct anterior){
    this.parentese = parentese;
    this.anterior = anterior;
  }

  public char GetDado(){
    return this.parentese;
  }

  public void setDado(char parentese){
    this.parentese = parentese;
  }
  
  public struct getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(struct anterior){
    this.anterior = anterior;
  }
}