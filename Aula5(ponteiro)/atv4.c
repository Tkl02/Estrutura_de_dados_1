#include <stdio.h>

int main(void)
{
    int num1, num2;

    scanf("%i", &num1);
    scanf("%i", &num2);

    printf("fazer alteração? 1(sim) 2(nao)!\n");
    alterar();
return 0;
}

int alterar(int num1, int num2){
    printf("%i", &num2);
    printf("%i", &num1);
}
