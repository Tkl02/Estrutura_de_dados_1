#include <stdio.h>

int calculo(a,b,c);  //declarando função
int main(void)     //função MAIN
{
    int a=10, b=17,c=0; //atribuindo variaveis
        printf("\nvalor A: %i", a);  //mostrando variavel a
        printf("\nvalor B: %i", b);  //mostrando variavel b

    printf("\n\n-=-=-=-=-CHAMANDO FUNCAO-=-=-=-=-\n\n");
    c = calculo(a,b,c); //chamando função e jogando na variavel "c"

    printf("valor de a: %d \nvalor de b: %d \nresult soma: %d\n",a,b,c); //printando resultado da função
    return 0;
}
int calculo(a,b,c){
    c=b+a;  //calculando
    return c; //retornando "c" para receber a função "calculo"
}
/*
    o programa vai execultar ate a linha 10. na linha 11 ele vai chamar a função "calculo" 
    que ficara guardade em c, que voltara a ler a função "main"
*/