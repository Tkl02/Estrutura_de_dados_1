#include <stdio.h>

int main() {
	int A;
	int *B = &A;   
	int **C = &B;  
	int ***D = &C;
	
	printf("\ndigite um valor: ");
	scanf("%d", &A);
	
	printf("\nDobro e: %d", (*B * 2));
	printf("\nTriplo e: %d", (**C * 3));
	printf("\nQuadruplo e: %d", (***D * 4)); 
	
	return 0;
}