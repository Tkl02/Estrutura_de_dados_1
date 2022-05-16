#include<stdio.h>

void calc_esfera(float R, float *a, float *v) {
    (*a) = 4 * 3.1415 * R * R;
    (*v) = (4/3) * 3.1415 * R * R * R;
}
int main(void){
    
    float raio, a, v;
    
    printf("Entre com o raio: ");
    scanf("%f", &raio);

    calc_esfera(raio, &a, &v);
    printf("\n A area  da superficie e: %.2f", a);
    printf("\n O volume de uma esfera e: %.2f\n", v);

    return 0;
}