#include <stdio.h>

int main(void)
{
    int i, resul[5], num[5];

    for (i = 0; i < 5; i++)
    {
        scanf("%d", &num[i]);
    }

    for (i = 0; i < 5; i++)
    {
        resul[i] = num[i]*2;
    }
    

    for (i = 0; i < 5; i++)
    {
        printf("o dobro dos valores e: %d\n", resul[i]);
    }
    
    return 0;
}
