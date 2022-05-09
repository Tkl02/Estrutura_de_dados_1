#include <stdio.h>

int main(void)
{
    int i,num[5];

    for (i = 0; i < 5; i++)
    {
        scanf("%d", &num[i]);
    }

    if (num[i]%2 ==0)
    {
        printf("o endereço do numero %d e %p:",num[i]);
    }
    else
    printf("numero impar!!");

    
    return 0;
}
