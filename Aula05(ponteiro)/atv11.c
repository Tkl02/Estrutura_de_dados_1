#include <stdio.h>

int main(void)
{
    int i,num[5];

    for (i = 0; i < 5; i++)
    {
        scanf("%d", &num[i]);
    }

    for (i = 0; i < 5; i++)
    {
           if (num[i]%2 ==0)
    {
        printf("\no endereco do numero %d e %p: \n",num[i],num[i]);
    }
    else
    printf("\nnumero %d e impar!!\n",num[i]);

    }
    
    return 0;
}
