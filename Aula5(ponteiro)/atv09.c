#include <stdio.h>

int main(void)
{
    float matriz[3][3] = {6.5, 7.2, 8.8, 0.9, 4.7, 5.5};
    int l,c;

    for (l = 0; l < 3; l++)
    {
        for (c = 0; c < 3; c++)
        {
            printf("linha (%d) coluna(%d) Endereço[%p]\n",matriz[l],matriz[c]);
        }
        
    }
    

    return 0;
}
