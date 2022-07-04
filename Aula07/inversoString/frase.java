package Aula07.inversoString;


public class frase {
  private char letra;
  private frase anterior;

  public frase(){}
 
  public frase(char letra, frase anterior){
    this.letra = letra;
    this.anterior = anterior;
  }

  public char GetDado(){
    return this.letra;
  }

  public void setDado(char letra){
    this.letra = letra;
  }
  
  public frase getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(frase anterior){
    this.anterior = anterior;
  }
}
