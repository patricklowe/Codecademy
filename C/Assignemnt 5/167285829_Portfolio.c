/* 
Patrick Löwe - COMP10110 - 16725829
Assignment 5 - Question 1 as For Loop - Portfolio
*/
#include <stdio.h>
int main(void)
{
	int i, n;
	int a_n_minus_2 = 1;
	int a_n_minus_1 = 2;
	int a_n;
	
	printf("How many numbers of the Fibonacci sequence would you like: ")
	scanf("%d", &n);
	
	if (n>0) //if the user input is greater than 0 do the following
	printf("1 ");
	if(n>1) //if the user input is greater than 0 do the following
	printf("1 ");
	
	if(n>2) //if the user input is greater than 2 do the following
	{
		for (i=3; i<=n;i++) // while the current number is 3 (i=3) and i is less than n (user input), loop
		{
			a_n = a_n_minus_2 + a_n_minus_1; // store 1 + 2 in a_n
			printf("%d ", a_n); // print the value of a_n (firstly 3)
			a_n_minus_2 = a_n_minus_1; //make a_n_minus_2 equal to a_n_minus_1 
			a_n_minus_1 = a_n; //make a_n_minus_1 equal to the previously printed value (firstly 3), then continue the loop
		}
	}
	printf("\n");//when finished print a new line
	return 0;
}
