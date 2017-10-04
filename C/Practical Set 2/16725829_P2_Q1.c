/*	Converting Decimal to binary
	16725829 
	Portfolio Work Practical Set 2 */
#include <stdio.h>
/* 	-- Explaination --
	Program will get remainder of user input by 2, dividing up the number into either a 1 or a 0.
	it then loops through the stored array for either a 1 or a 0 and prints out.
*/
int main(void){
	int iDecimal, iBinary[15], i=1, j;

	printf("- - - Converting Decimal to Binary - - -\n");
	printf("\tEnter Decimal Number: ");
	scanf("%d", &iDecimal); //Stores user input for Decimal to be converted
	printf("\n\tBinary Equivalent of %d:\n\t", iDecimal);
	
	while(iDecimal !=0){ // loops through the value until it reaches 0
	iBinary[i++] = iDecimal % 2; // gets remainder of value by 2, storing either 1 or 0
	iDecimal = iDecimal / 2; // divides value by 2 and loops again for next binary digit
	}
	
	for(j = i -1 ;j> 0;j--){
	printf("%d", iBinary[j]); //loop for printing value in array to appear as a binary conversion
	}
}

