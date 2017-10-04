// Program to Calculate the Over-Crowded Housing
// Computer Programming COMP10120
// Student 16725829
#include <stdio.h>	

int main()
{
    int Rooms;
    char Status;
    int People;
    
    printf( "Number of Rooms in Household (excluding Bathrooms): " );
    scanf( "%i", &Rooms );
    printf( "Number of People in Household: " );
    scanf( "%i", &People );
    
    if ( (Rooms / People) < 2 ) {
	printf ("Household is Overcrowded\n");
	}
	
    else {
	printf ("No Overcrowding");
	}
	
  return 0;
}
