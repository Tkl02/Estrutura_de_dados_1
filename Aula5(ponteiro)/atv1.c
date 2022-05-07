#include <stdio.h>
#include <stdlib.h>
int main(void)
{
  int x, *ptri, **pptri;
  float z, *ptrr, **pptrr;    ///////variaveis + ponteiros
  char y, *ptrc, **pptrc; 

  //////////////////// ponteiro do numero inteiro///////////////////////////////////////////////////////////
  x = 0;
  printf("\nvalor de x= %d\n", x);     //mostrando valor de "X"
  printf("Endereco de x: %x\n", &x);   //mostrando endereço de "X"
  
  ptri = &x;       // ptri aponta para X
  pptri = &ptri;   //pptri aponta para ptri

*ptri = *ptri + 17; //modificando "ptri" atraves do ponteiro

printf("\nvalor dex=%d", x);  // mostrando novo valor de "X"
printf("\nEndereco apontado por ptrx: %x",ptri);  // endereço de "X"
printf("\nEndereco de memoria da variavel ptrx %x\n",&ptri); //endereço de ptri (apontando para "X")
printf("\n INDO PARA VALOR REAL \n");

 //////////////////// ponteiro do numero real//////////////////////////////////////////////////////////////
  z = 5.13;
  printf("\nvalor de z= %f\n", z);
  printf("Endereco de z: %f\n", &z);

  ptrr = &z;
  pptrr = &ptrr;

  *ptrr = *ptrr + 12.32;

printf("\nvalor de z=%f", z);
printf("\nEndereco apontado por ptrx: %x",ptrr);
printf("\nEndereco de memoria da variavel ptrx %x\n",&ptrr);
}