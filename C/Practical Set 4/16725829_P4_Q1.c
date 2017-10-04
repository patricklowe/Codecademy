// Program for horse race
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// function prototypes
void movejockeyA( int *jockeyA);
void movejockeyB (int *jockeyB);
void printCurrentPositions(unsigned int, unsigned int, int);
unsigned int counter = 0; // counter for the for loop controling the race.
int main()
{
	unsigned int jockeyA = 1; // jockeyA current position
	unsigned int jockeyB = 1; // jockeyB  current position      
	
   puts("The Race has started!");
   // loop through the progress on the track
   while (jockeyA != 100 && jockeyB != 100) { //neither horse has reached the end of the track
    //^^call functions to move horses on the track and print current positions
	movejockeyB(&jockeyB);
	movejockeyA(&jockeyA);
	printCurrentPositions(jockeyA,jockeyB,counter);
	++counter;
   } 

   // determine the winner and print message - one horse/jockey has passed the end as it is outside the loop.
   if (jockeyA > jockeyB) {
	//^^print the outcome 
    printf("JockeyA Has Won the race!\n");
   } 
             
   if (jockeyA < jockeyB) {
    //^^print the outcome 
    printf("JockeyB Has Won the race!\n");
   }
   else {
     //^^print the outcome 
     printf("");
   } 

   printf("iteration: %u", counter);
} 

// progress for Jockey B
void movejockeyB(int *jockeyBPtr)
{ 
    // ^^generate random number from 1-10 - make sure it is different each time program is run.
   int x = 0;
   int y = 0;
   x = rand() % 11;
   printf("Jockey B rolled:%d\n", x);
   // determine progress
   if (x == 1) { // super speed 10% of the time
    *jockeyBPtr += 4;
    printf("Jockey B moves 4 places\n");
   } 
 
   else if (x > 1 && x <= 5) { // Progress 2 space, 40% of the time
    *jockeyBPtr += 2;
    printf("Jockey B moves 2 places\n");
   } 
   else if (x >= 6 && x <= 7) { // Progress 1 spaces, 20% of the time
    *jockeyBPtr += 1;
    printf("Jockey B moves 1 place\n");
   }
   else if (x == 8) { // Progress 0 spaces, 10% of the time
    *jockeyBPtr += 0;
    printf("Jockey B moves 0 places\n");
   }
   else if ((x == 9) || (x == 10) ) { // Progress 3 spaces, 10% of the time
      *jockeyBPtr -= 2;
      printf("Jockey B moves back 2 places\n");
   }
	
   // check boundaries 
   if (*jockeyBPtr < 1) {
      *jockeyBPtr = 1;
   } 
   if (*jockeyBPtr > 100) {
      *jockeyBPtr = 100;
   }
   else if((*jockeyBPtr == 5) || (*jockeyBPtr == 25) || (*jockeyBPtr == 50) || (*jockeyBPtr == 75)){
   printf("Jockey B Hit a Fence!\n");
   *jockeyBPtr = 0;	
   }
} 

// progress for the Jockey A
void movejockeyA(int *jockeyAPtr)
{ 	
    //^^complete code here
    // ^^generate random number from 1-10 - make sure it is different each time program is run.
   int x = 0;
   int y = 0;
   x = rand() % 11;
   printf("\n\nJockey A random:%d\n", x);
   // determine progress
  	if (x == 1) { // super speed 10% of the time
    *jockeyAPtr += 4;
    printf("Jockey A moves 4 places\n");
   } 
 
   else if (x > 1 && x <= 5) { // Progress 2 space, 40% of the time
    *jockeyAPtr += 2;
    printf("Jockey A moves 2 places\n");
   } 
   else if (x >= 6 && x <= 7) { // Progress 1 spaces, 20% of the time
    *jockeyAPtr += 1;
    printf("Jockey A moves 1 place\n");
   }
   else if (x == 8) { // Progress 0 spaces, 10% of the time
    *jockeyAPtr += 0;
    printf("Jockey A moves 0 places\n");
   }
  else if ((x == 9) || (x == 10) ) { // Progress 3 spaces, 10% of the time
      *jockeyAPtr -= 2;
      printf("Jockey A moves back 2 places\n");
   }
    
   // check boundaries 
   if (*jockeyAPtr < 1) {
      *jockeyAPtr = 1;
   } 
   if (*jockeyAPtr > 100) {
      *jockeyAPtr = 100;
   }
   if((*jockeyAPtr == 5) || (*jockeyAPtr == 25) || (*jockeyAPtr == 50) || (*jockeyAPtr == 75)){
   printf("Jockey A Hit a Fence!\n");
   *jockeyAPtr = 0;	
   }
} 

// display new position each time there is a move.
void printCurrentPositions(unsigned int jockeyA, unsigned int jockeyB, int count)
{ 
	// print current leader
    if (jockeyA == jockeyB) {
         printf("%s",  "\nJockeys are Tied!");
      } 
      else if (jockeyA < jockeyB) {
        //^^implement what should happen in this case 
      printf("\nB is in the lead!");
	  } 
      else if (jockeyB < jockeyA) {
        //^^implement what should happen in this case 
      printf("\nA is in the lead!");
	  } 
      else {
        //^^implement what should happen in this case (print a space)
      printf("");
	  } 
//   printf("\rIn progress %d", count);
   
   printf("\nPosition A:%d \nPosition B:%d", jockeyA, jockeyB);
   sleep(2);
   system("CLS");
} 


