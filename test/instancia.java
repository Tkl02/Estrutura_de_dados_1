import java.text.DecimalFormat; //← bibliotecas para auxiliar
import java.util.Scanner; //← na construçao de um codigo

public class atvPortugol {
        public static void main(String[] args) {

                try (Scanner scan = new Scanner(System.in)) {
                        double a, b;
                        System.out.println("Digite um numero: ");
                        a = scan.nextDouble();
                        // raiz
                        b = Math.sqrt(a);
                        System.out.println("A raiz de " + a + " e: " + b);

                        // raiz cubica
                        b = Math.cbrt(a);
                        System.out.println("O valor(raiz cubica) e: " + b);

                        // raiz, exponenciação, logaritmo com numero inteiro
                        b = (Math.exp(1 / 2 * Math.log(a)));
                        DecimalFormat formatador = new DecimalFormat(".0");
                        System.out.println("O valor (int de exp, log) de " + a + " e: " + formatador.format(b));

                        // raiz, exponenciação, logaritmo sem numero inteiro
                        b = (Math.exp(1 / 2 * Math.log(a)));
                        System.out.println("O valor de (exp, log) " + a + " e: " + b);

                        // formatar usando essa formula
                        b = (float) (Math.sin(45 * Math.PI / 180) + 0.00013);
                        System.out.println("O valor((sen(45*pi/180)+0.0001,3) e: " + formatador.format(b));

                        // potencia com exponenciação e logaritmo com formatação
                        b = (Math.exp(3 * Math.log(8)) + 0.0013);
                        System.out.println("O valor(potencia com exp e log) e: " + formatador.format(b));

                        // potencia com exponenciação e logaritmo sem formatação
                        b = (Math.exp(3 * Math.log(8)) + 0.0013);
                        System.out.println("O valor(potencia com exp e log) e: " + b);

                        // potencia com exponenciação e logaritmo sem formatação
                        b = Math.exp(3 * Math.log(8));
                        System.out.println("O valor(potencia com exp e log) e: " + b);

                        // numero absoluto
                        b = Math.abs(-8);
                        System.out.println("O valor(absoluto) e: " + b);

                        // conversor de decimal
                        System.out.println("O valor em float e: " + a);
                        // a pessoa digita um numero float, que vai ser colocado pra inteiro e receber a
                        // variavel de C pra ser arredondado
                        int c = (int) Math.round(a);
                        System.out.println("O valor em int e: " + c); // imprime o novo valor de C
                        //
                        System.exit(0);
                }
        }
}