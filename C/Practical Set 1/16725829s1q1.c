// Program to Calculate the Charity Donations
// Computer Programming COMP10120
// Student 16725829
#include <stdio.h>	

int main()
{
    float Sales;
    float Donation;
    
    printf( "Todays Sales (in Euro): " );
    scanf( "%f", &Sales );
    
    if ( Sales < 5000 ) {  
	Donation = Sales * 0.05;
	printf ("Donation: %f Euro\n", Donation);
	}

    else if ( 5000 < Sales < 10000 ) {
	Donation = (Sales - 5000) * 0.1 + 250;            
	printf ("Donation: %f Euro\n", Donation);
    }

    else {
	Donation = (Sales - 10000) * 0.15 + 750;            
	printf ("Donation: %f Euro\n", Donation);
	}
	
  return 0;
}
