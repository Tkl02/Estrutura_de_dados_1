#include <stdio.h>

int calculo(a,b,c);  //declarando função
int main(void)     //função MAIN
{
    int a=10, b=17,c=0; //atribuindo variaveis
        printf("\nvalor A: %i", a);  //mostrando variavel a
        printf("\nvalor B: %i", b);  //mostrando variavel b

    printf("\n\n-=-=-=-=-CHAMANDO FUNCAO-=-=-=-=-\n\n");
    calculo(a,b,c); //chamando função 
    return 0;
}
int calculo(a,b,c){
    a =a*2;
    b =b*2;
    c=a+b;
    printf("quadrado de a: %d \nquadrado de b: %d \nresult soma: %d",a,b,c);
    return 0;
}