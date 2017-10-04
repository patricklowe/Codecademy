#include <stdio.h>
#define N 10
// Reverse an Array
// Patrick Löwe 16725829

int main() {
   int a[10], first, last, num, temp;
   printf("\n Enter the Numbers in the Array: ");
   scanf("%d", &num);
 
   for (first = 0; first < num; first++) {
      scanf("%d", &a[first]); // store input into array
   }
 
   last = first - 1; //find last interger by finding the first and going back
   first = 0; //set position of the first to 0
   
   while (first < last) { //while position of the first is less than the last, loop
    temp = a[first]; //temporarily store the first here
    a[first] = a[last];//make the first = last position
	a[last] = temp; // store the last one temportatily while it loops, preventing the real last from overwriting
	first++;//increment the first position
    last--;//decrement the last position
   }
 
   printf("\nReversal of Array: ");
   for (first = 0; first < num; first++) {
      printf("%d,", a[first]); // print out the new array
   }
 
   return (0);
}
