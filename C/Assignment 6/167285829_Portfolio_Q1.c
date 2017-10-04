#include <stdio.h>
#define N 10
// Calculate the Kth largest number in an array
// Patrick Löwe 16725829

int kthSmallest(int a[], int n, int k)
{
	sort(a, a+n);
    // Return k'th element in the sorted array
    return a[k-1];
}

int main(void) {
   int a[10], first, last, num, temp;//declaring variables
   printf("\n Enter the Numbers in the Array: ");
   scanf("%d", &num);//gather user input
 
   for (first = 0; first < num; first++) { //place user input into array
      scanf("%d", &a[first]);
   }
 
   last = first - 1;//sort the last number
   first = 0;
    int n = sizeof(a)/sizeof(a[0]), k = 2;
    printf("K'th smallest element is ", kthSmallest(a, n, k)); //prints array from smallest to largest
    return 0;
}
