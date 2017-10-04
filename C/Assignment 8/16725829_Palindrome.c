/* Patrick Löwe - 16725829 - C Program to check if entry is Palindrome */
#include <stdio.h>
int main()
{
	//declare variables
    int n, revN = 0, remain, orig;
    //Receive user input
	printf("\tTo Check if a sequence of Numbers is Palindrome \n");
    printf("\tEnter a sequenece of numbers:");
    scanf("%i", &n);
	//Store the original number in orig
    orig = n;

    //Find and Store the reversed variable 
    while( n!=0 )
    {
        remain = n%10;
        revN = revN*10 + remain;
        n /= 10;
    }

    // Check if the revN array equals the orig array
    if (orig == revN)
        printf("\n \t%i is a palindrome.", orig);
    else
        printf("\n \t%i is not a palindrome.", orig);
    return 0;
}
