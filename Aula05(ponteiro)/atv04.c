#include <stdio.h>

int alterar(a,b);  //declarando função
int main(void)     //função MAIN
{
    int a=10, b=17; //atribuindo variaveis
        printf("\nvalor A: %i", a);  //mostrando variavel a
        printf("\nvalor B: %i", b);  //mostrando variavel b

    printf("\n\n-=-=-=-=-CHAMANDO FUNCAO-=-=-=-=-\n\n");
    alterar(a,b); //chamando função 
    return 0;
}

int alterar(a, b){  //definindo(configurando) função
    printf("valor de A: %i", b);
    printf("\nvalor de B: %i\n", a);
    return 0;
}
