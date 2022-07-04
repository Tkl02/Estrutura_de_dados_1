package Aula13.jogoDeParenteses;

public class atv{
  public static void main(String[] args) {
    atv stackOpen = new atv();
    atv stackClose = new atv();
    int open = 0, close = 0;
    String certo = "";
    String parenteses = "( (  –  (  (  )  (  –  )  )  (  ())))";
    int length = parenteses.length();
    for (int i = 0; i < length; i++) {
      if(parenteses.charAt(i) == '('){
        stackOpen.push('(');
        open++;
      }else if(parenteses.charAt(i) == ')'){
        stackClose.push(')');
        close++;
      }
      if (open >= close) {
        certo = "Certinho abigo";
      }else{
        certo = "Errado manim";
        break;
      }

    }

    if (open > close) {
      certo = "Errado manim";
    }
    System.out.print(certo+": "+ parenteses);
    
  }

private void push(char c) {
}
}

