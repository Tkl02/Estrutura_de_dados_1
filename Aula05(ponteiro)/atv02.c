#include <stdio.h>
#include <stdlib.h>

int main(void){
    int a, b, *ptra, *ptrb;  //variaveis

    a = 9;  //atribuindo valor as variaveis
    b = 11;

    ptra = &a;
    ptrb = &b;

printf("\nvalor de a= %i\n", a);   //mostrando valor de A
printf("Endereco de a: %p\n", &ptra); //mostrando endereço de A

printf("\nvalor de b= %i\n", b);   //mostrando valor de B
printf("Endereco de b: %p\n\n", &ptrb); //mostrando endereço de B

    if (&a > &b)
    {
        printf("endereço a maior");
    }
    else{
         printf("endereço b maior");
    }
    

}