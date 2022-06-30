
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

class Nv {
    public int item;
    public Nv anterior;
}

class Pilhass {
    private Nv topo;
    public Pilhass() { 
        topo = null;
    }

    public boolean empty() {  
        return (topo == null);
    }

    public int top() {    
        return topo.item;
    }

    public void pop() {     
        if (!empty()) {    
            topo = topo.anterior;
        }
    }

    public void push(int valor) { 
        Nv novo = new Nv(); 
        novo.item = valor;
        novo.anterior = topo;
        topo = novo;
    }
}

class Pilhas {

    public static void main(String[] args) throws IOException {
        Pilhass p = new Pilhass();
        int nro1, nro2;
        char c; 
        System.out.println("---------------------------");
        System.out.println("Calculadora notação pos-fixa");
        System.out.println("   Exemplo de uso:\n   5 9 + 2 * 6 5 * + "); 
        System.out.println("---------------------------");
        System.out.print("Informe sua expressao:\n   ");
        
        String s = lerStr();

        for (int i = 0; i < s.length(); i++) {  
            c = s.charAt(i);   
            
           
            if (Character.isDigit(c)) {   
                p.push(Character.digit(c, 10));
            } else if (c == '+') {   
                nro1 = p.top();
                p.pop();
                nro2 = p.top();
                p.pop();
                p.push(nro1 + nro2);
            } else if (c == '*') {  
                nro1 = p.top();
                p.pop();
                nro2 = p.top();
                p.pop();
                p.push(nro1 * nro2);
            } else if (c == '-') {    
                nro1 = p.top();
                p.pop();
                nro2 = p.top();
                p.pop();
                p.push(nro1 - nro2);
            } else if (c == '/') {   
                nro1 = p.top();
                p.pop();
                nro2 = p.top();
                p.pop();
                p.push(nro1 / nro2);
            } else if (c == '^') {   
                nro1 = p.top();
                p.pop();
                nro2 = p.top();
                p.pop();
                p.push((int) Math.pow(nro1, nro2));  
            }
        }
        System.out.println("Resposta = " + p.top());
        p.pop();
    }

    public static String lerStr() throws IOException { 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}