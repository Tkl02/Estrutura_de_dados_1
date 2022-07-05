package Aula7.calcpolonesa;

import br.edu.fasul.lac.estruturas.Fila;
import br.edu.fasul.lac.estruturas.Pilha;

public class ExpressaoLogica {

    String expressao;
    String[] segmentos;
    Fila fila;
    Pilha pilha;


    public ExpressaoLogica() {
    }

    public ExpressaoLogica(String expressao) {
        this.expressao = expressao;
    }

    public void executa() {
        segmentos = quebra();
        separa();
        resolve();
    }

    public String[] quebra() {
        expressao = expressao.replaceAll(" ", "").replaceAll("", " ");
        expressao = expressao.replaceAll("< - >", "<->").replaceAll("- >", "->").trim().toUpperCase();
        return expressao.split(" ");
    }

    public static boolean isValida(String expressao) {
        int c_parenteses = 0;
        expressao = expressao.replaceAll(" ", "").toUpperCase();

        while (true) {
            
            for (int i = 0; i < expressao.length(); i++) {
                if (expressao.charAt(i) == '(') {
                    c_parenteses++;
                }
                if (expressao.charAt(i) == ')') {
                    c_parenteses--;
                }
            }
            
            if (c_parenteses == 0) {
                if (expressao.matches("^(~*[(]*?|([FT]|[(]*[~]*?[FT])[)]*?(V|\\^|->|<->)[(]?~?[(]?)*(F|T|[FT][)]*)$")) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public boolean isMaisImportante(String valor, String topo_pilha) {
        String precedencia = "~^V-<"; 
        if (topo_pilha.equals("(")) {
            return false;
        } else if (precedencia.indexOf(topo_pilha) >= precedencia.indexOf(valor)) {
            return false;
        }
        return true;
    }

    public void separa() {
        fila = new Fila();
        pilha = new Pilha();
        for (String token : segmentos) {
            if (token.matches("[FT]")) { 
                fila.insere(token);
            } else if (token.equals("~") || token.equals("(")) {
                pilha.insere(token);
            } else if (token.equals(")")) {
                while (!(pilha.verificarFinal().equals("("))) { 
                    fila.insere(pilha.retira());
                }
                pilha.retira(); 
            } else { 
                if (!pilha.isVazia()) {
                    if (isMaisImportante(token, (String) pilha.verificarFinal()))
                    {
                        fila.insere(pilha.retira());
                    }
                }
                pilha.insere(token);
            }
        }
        
        while (!pilha.isVazia()) {
            fila.insere(pilha.retira());
        }
    }

    public void resolve() {
        String i, j;
        while (!fila.isVazia()) {
            String x = (String) fila.retira();
            if (x.equals("F") || x.equals("T")) {
                pilha.insere(x);
            } else {
                switch (x.charAt(0)) {
                    case '^': 
                        i = (String) pilha.retira();
                        j = (String) pilha.retira();
                        pilha.insere(OperacoesLogicas.and(j, i));
                        break;
                    case 'V': 
                        i = (String) pilha.retira();
                        j = (String) pilha.retira();
                        pilha.insere(OperacoesLogicas.or(j, i));
                        break;
                    case '~': 
                        i = (String) pilha.retira();
                        pilha.insere(OperacoesLogicas.not(i));
                        break;
                    case '-': 
                        i = (String) pilha.retira();
                        j = (String) pilha.retira();
                        pilha.insere(OperacoesLogicas.implicacao(j, i));
                        break;
                    case '<': 
                        i = (String) pilha.retira();
                        j = (String) pilha.retira();
                        pilha.insere(OperacoesLogicas.bicondicional(i, j));
                        break;
                }
            }
        }
    }

    public String resposta() {
        return pilha.toString();
    }
}