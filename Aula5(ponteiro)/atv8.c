#include <stdio.h>

int main(void)
{
    float numeros[10] = {9.8, 7.6, 8.2, 7.0, 6.5, 4.1, 3.6, 7.1, 5.3, 8.8};
    int i,n =1;
    for (i = 0; i < 10; i++)
    {
        printf("endereço %i = %p\n",n++, numeros[i]);    
    }

    return 0;
}
