/*
Patrick Löwe - COMP10110 - 16725829
// Assignment 4 - Question 1 - 7
*/
// include files - library
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

// Declare global variables
// Menu for choosing a question
char iCalc;
//Function with respect to each questions
void q1();
void q2();
void q3();
void q4();
void q5();
void q6();
void q7();
float main(void)
{
	/* Setting up the screen */
	system("color 79");
	do
{	
	/* Menu for selecting a question*/
	printf("\t Patrick Lowe - Assignment 4 - 16725829");
	printf("\n \n Please Select a Question: \n");
	printf("\t 1. Quadratic Equation \n");
	printf("\t 2. 0 - 100 \n");
	printf("\t 3. 0 - 100 Evens \n");
	printf("\t 4. Guessing Game \n");
	printf("\t 5. Guessing Game, 3 Attempts \n");
	printf("\t 6. Prime Number \n");
	printf("\t 7. All Primes between 1 & 100 inclusive \n");
	printf("\n Question Selection: \t ");
	scanf("\n %c", &iCalc);
	
	switch(iCalc)
{
	/* switch to the questions inputted by the user */
		case '1':
			q1();
			break;
		case '2':
			q2();
			break;
		case '3':
			q3();
			break;
		case '4':
			q4();
			break;
		case '5':
			q5();
			break;
		case '6':
			q6();
			break;
		case '7':
			q7();
			break;
		default: //if none of the valid entries above were used do the following
			printf("\n \t Invalid Entry!");
} /* End of switch */
	getch(); //Get character

	/* Generate options menu */
	printf("\n \n Do you wish to continue(Y/N):\t ");
	scanf("\n %c", &iCalc);	
	system("cls");
}	/* End of Do */
	while(iCalc == 'y');

} /* End of Main */

void q1() //Question one
{
	double a,b,c,r1,r2;
	printf(" Please enter A: ");
	scanf("%lf",&a);
	printf(" Please enter B: ");
	scanf("%lf",&b);
	printf(" Please enter C: ");
	scanf("%lf",&c);
	
	r1 = (-b + sqrt(b*b-4.*a*c) ) / (2.*a); //Get the + value of the quadratic equation
	r2 = (-b - sqrt(b*b-4.*a*c) ) / (2.*a); // GEt the - value of the quadratic equation
	
if(a == 0){
	printf("The root cannot be computed when a is zero. \n"); //Provide error message
}
else{ //If successful do the following
	printf("\n First root is %lf ",r1); //Print result of + value
	printf("\n Second root is %lf ",r2); //Print result of the - value
	printf("\n ");
}
}

void q2() //Question 2, print 0 to 100 with each on a new line
{
	int i;
	for(i=0; i<=100;i++) //While i is less than 100 loop
	printf("%i \n", i); //print the current value of i
}

void q3() // question 3, print all even numbers 0 to 100
{
	int i;
	for(i=0; i<=100;i++) //while i is less than 100, loop
	if(i%2 == 0){ //if the current value of i divided by 2 has remainder 0, print it
	printf("%i \n", i);
	}
}

void q4() //question 4, guessing game
{
	int r = rand() % 11; //generate a random number between 1 and 10
	int g;//store users guess
	printf("Enter your guess: ");
	scanf("%i", &g); //scans for users input as integer
	if(g == r) //if user input is equal to the random generated number do the following
	{
		printf("You guessed correctly, the answer was %d", r);
	}
	else if(g < r) //if user input is less than random number do the following
	{
		printf("You gueessed incorrectly, the answer is greater \n");
	}
	else if(g > r) //if user input is greater than random number do the following
	{
	printf("You gueessed incorrectly, the answer is lower \n");	
	}
	}
	
void q5() //question 5, allow 3 attempts at guessing the random number
	{
	int r = rand() % 11;
	int g;
	int i;
	for(i=0; i<=3;i++) //While i is less than 3 loop
	{
	printf("Enter your guess: ");
	scanf("%i", &g);// store first guess
	if(g == r)// if guess is correct do the following
	{
	printf("You guessed correctly, the answer was %d", r);
	}
	else if(g < r)//if guess is less than random number do the following
	{
	printf("You gueessed incorrectly, the answer is greater \n");
	printf("Enter your second guess: ");	
	scanf("%i", &g);//store the second guess
	}
	else if(g > r)//if guess is greater than random number
	{
	printf("You gueessed incorrectly, the answer is lower \n");	
	}
	}
	printf("You have not guessed correctly within 3 attempts!")
}	

void q6()//question 6, prime numbers
	{
	int i,p,b=0;
    printf("Enter an integer: ");
    scanf("%d",&i); //stores user input
    for(p=2; p<=i/2; ++p)//if 2 is less than half the number input, loop again
    {
	if(i%p==0)//if number inputted is divisible by the above value break the loop
    {
    	b=1; //break the loop
		break;
    }
    }
    if (b==0)// give answer
        printf("%i is a prime number.",i);
    else
        printf("%i is not a Prime Number",i);
}

void q7()//question 7, write out prime numbers 1 - 100
	{
	int i, j, n=100, isPrime; 
	printf("\nAll prime numbers between 1 to %d are:\n", n);
	for(i=2; i<=n; i++)//current number is less than 100, loop
	{
	isPrime = 1; //instantiate at 1
	for(j=2; j<=i/2; j++)//if the current number to be checked when halved is greater than the looping value, continue to loop
	{
	if(i%j==0)//if the current number has no remainder when divied by J break the loop
	{
	isPrime = 0;
	break;
	}
	}
	if(isPrime==1) //if the found number is a prime, print and restart the loop
	{
	printf("%d is Prime number\n", i);
	}
	}
}

