package Aula13.imparOuPar;

public class struct {
  private byte number;
  private struct anterior;

  public struct(){}
 
  public struct(byte number, struct anterior){
    this.number = number;
    this.anterior = anterior;
  }

  public byte GetDado(){
    return this.number;
  }

  public void setDado(byte number){
    this.number = number;
  }
  
  public struct getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(struct anterior){
    this.anterior = anterior;
  }
}