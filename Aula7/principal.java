package Aula7;

public class principal {
  public static void main(String[] args) {

    Stack letras = new Stack();
    
    String phrase = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

    int index = 0;
    for (int i = 0; i < phrase.length(); i++) {
      if(phrase.charAt(i) != ' '){
        letras.push(phrase.charAt(i));
        index++;
      }else{
        while(index > 0){
          letras.pop();
          index--;
        }
        System.out.print(" ");
        index = 0;
      }      
    }
  }
}