#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	int count=0, iNum, w=0, x=1, y=2, z=3;
	while (count<4)
	{
	printf("Please enter an integer: ");
	scanf("%i", &iNum);
	z = iNum;
	if(w < z) // W contains the smallest value
		w = iNum;
	if(x < z)// X contains next smallest
		
	if(y < z)// Y Contains next smallest
		
	if(z = z)// Z continas the largest
		
	count++;
	}
	printf("W is:%i, X is:%i, Y is:%i, Z is:%i, ",w,x,y,z);
}
