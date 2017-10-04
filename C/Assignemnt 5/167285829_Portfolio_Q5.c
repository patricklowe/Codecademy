#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	int iNum;
	float sum;
	
	printf("Please enter the total numbers to be calculated: ");
	scanf("%i", &iNum);
	sum = 1 + (1/2) + (1/3) + (1/4) + (1/5); 
	printf("The total is: %f", sum);
	return 0;
}
