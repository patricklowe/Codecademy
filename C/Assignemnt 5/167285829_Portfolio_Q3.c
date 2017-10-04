#include<stdio.h>
#include<stdbool.h>
int main(void)
{
   int limit, i=3, count, c,x;
   printf("Please enter the number of sequences: ");
   scanf("%d",&limit);
   printf("First %d Padovan numbers are :\n 1, 1, 1, ",limit);
 
   for(count=0;count<=limit;count++)
    {
        printf("%d, ", Padovan(x)); //prints the curent value for Pavodan
        x++; // gets the next pavodan number
    }
    printf("\n Padovan value for n: %d\n", Padovan(limit)); //prints the number of sequences the user asked for
}
 
int Padovan(int p) //function for computing the next pavodan number
{
    if(p == 0 || p == 1 || p == 2) // if the numbers are 0,1, or 2 then end the program
        return 1;// ends the program
    return Padovan(p-2) + Padovan(p-3); //return the value for pavodan calculated here into the main function
}
