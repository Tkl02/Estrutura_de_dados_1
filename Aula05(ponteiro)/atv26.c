#include <stdio.h>
#include <math.h>

float delta(float a, float b, float c){
float d;
d = (b * b - 4 * a * c);
return d;
}

float raiz(float d){
float r;
    r = sqrt(d);
return r;
}

int raizes(float a, float b, float c, float d, float r, float *x1, float *x2){
    *x1 = ((- + r)/2 * a);
    *x2 = ((- - r)/2 * a);
return ;
}
int main(){
    float a, b, c, d, r, x1, x2;

printf("digite o valor de a: ");
scanf("%f", &a);
printf("digite o valor de b: ");
scanf("%f", &b);
printf("digite o valor de c: ");
scanf("%f", &c);

    d = delta(a, b, c);
    r = raiz(d);

if (d < 0){
printf("valor de delta: %.2f\n", d);
printf("raiz inesistente.\n");

}else{
     
if (d == 0){
printf("Ovalor de delta e: %.2f\n", d);
printf("A raiz de delta e: %.2f\n", r);

raizes(a, b, c, d, r, &x1, &x2);
printf("Tem uma raiz: x1=%.2f e x2=%.2f\n", x1, x2);

}else{
      
if (d >= 0){
printf("valor delta: %.2f\n", d);
printf("raiz delta: %.2f\n", r);
raizes(a, b, c, d, r, &x1, &x2);
printf("existe duas raizes: x1= %.2f eh x2= %.2f\n", x1, x2);
    }
  }
}
return 0;
}