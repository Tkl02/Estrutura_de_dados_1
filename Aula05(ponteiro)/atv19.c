#include<stdio.h>

int max, rept; 

    max = 0;
    rept = 0;

void verificando(int *elementos, int num_elementos) {  

    int j;
    max = elementos[0];

        for(j=0; j<num_elementos; j++) {  

            if(max<=elementos[j]) {
            max = elementos[j];
}
}

        for(j=0; j<num_elementos; j++) {  

            if(max==elementos[j]) {
            rept++;
}
}
}

void main (){

    int N;
    int i = 0;

    printf("Digite a quantidade de  numeros para sua lista:\n");
    scanf ("%d", &N);

    int list[N];

    for (i = 0; i < N; i++){

       printf("\nDigite o numero %d:\n", i+1);
       scanf("%d", &list[i]);

}
    verificando(list, N); 

    printf("\nO maior numero digitado foi: %d\n", max);
    printf("Este numero se repetiu %d vezes\n", rept);
}