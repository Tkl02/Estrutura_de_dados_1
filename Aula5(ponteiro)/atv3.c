#include <stdio.h>
#include <stdlib.h>

int main(void){
    int a, b; 
    int *ptra, *ptrb;  //variaveis

  scanf("%.1f", &a);
  scanf("%.1f", &b);

    ptra = &a;
    ptrb = &b;

printf("\nvalor de a= %i\n", a);   //mostrando valor de A
printf("Endereco de a: %p\n", &ptra); //mostrando endereço de A

printf("\nvalor de b= %i\n", b);   //mostrando valor de B
printf("Endereco de b: %p\n\n", &ptrb); //mostrando endereço de B

    if (&a > &b)
    {
        printf("endereço A maior");
    }
    else{
         printf("endereço B maior");
    } 
}