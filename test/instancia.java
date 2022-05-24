package test;

public class instancia {
    public static void main(String[] args) {
        String s1 = "orbita invertida";

        test pilha = new test();

        Object topo = test.pilha();

        for(int i=0; i < 20; i++){
            if (s1.split(" ") != null) {
                topo = pilha.push(topo,s1);
            }
        }
    }
}
