#include <stdio.h>

int comparar(a,b);  //declarando função
int main(void)     //função MAIN
{
    int a=18, b=17; //atribuindo variaveis
        printf("\nvalor A: %i", a);  //mostrando variavel a
        printf("\nvalor B: %i", b);  //mostrando variavel b

    printf("\n\n-=-=-=-=-CHAMANDO FUNCAO-=-=-=-=-\n\n");
    comparar(a,b); //chamando função 
    return 0;
}
int comparar(a,b){
    if (a>b)
    {
        printf("valor A(%d) e maior q valor B(%d).",a,b);
    }
    else{
        printf("valor B(%d) e maior q valor A(%d).",b,a);
    }
    
}