#include <stdio.h>

int main(void)
{
    int A,B,C;
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);

    printf("\n ordem correta: \n");
    ordem(A,B,C);

    return 0;
}
int ordem(int A,int B,int C){

   if(A<B && B<C){
    printf("%d %d %d", A, B, C);
}else if(A<C && C<B){
    printf("%d %d %d", A, C, B);
}else if(B<A && A<C){
    printf("%d %d %d", B, A, C);
}else if(B<C && C<A){
    printf("%d %d %d", B, C, A);
}else if(C<A && A<B){
    printf("%d %d %d", C, A, B);
}else{
    printf("%d %d %d", C, B, A);
    }

}