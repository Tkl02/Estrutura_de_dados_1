package Aula6;

import java.util.Scanner;

public class pilha {

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        String s;
        
        System.out.printf("frase: ");   
        s = scan.nextLine();
        
        System.out.printf("\nEntrada: %s\n", s);  
        System.out.printf("Saída. : %s\n", inversor(s)); 
  }
}
  public static String inversor(String s){
    int i, n; 
    String v_auxiliar;
    
    v_auxiliar = "";
    n = s.length();
    for(i=(n-1); i>=0; i--) {
      v_auxiliar = v_auxiliar + s.charAt(i);
    }
    return(v_auxiliar);
  }  
}