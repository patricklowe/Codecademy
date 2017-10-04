#include <stdio.h>
#include <stdlib.h>
/*
  Written by: Neil Hurley (neil.hurley@ucd.ie)
  Program to write out a random array of floating point
  numbers, using the drand48 library function that is available
  in the stdlib library.
  Input: 
  Output: MAX_SIZE floating point numbers between 0 and 1
  Note that it should be easily possible to convert this program
  to one that writes out integer values rather than floating point
  values. A random integer between 1 and M, for some value M can
  be computed using (rand()%M)+1 
*/

int const MAX_SIZE=1000;
int main(void)
{
  int i;
  FILE *fp;
  fp =fopen("array.dat", "w");
  if (fp==NULL){
  	printf("File could not be opened \n");
  	return(0);
  }
  for (i=0;i<MAX_SIZE;i++)
    fprintf(fp,"%lf\n", rand()*1.0/RAND_MAX);
  return 0;
}
