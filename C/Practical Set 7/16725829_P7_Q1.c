#include<stdio.h>
#define printArray(myArray, length) \
for(i = 0; i < length; i++) \
    printf("%d\t", myArray[i]);
#define printReverse(myArray, length) \
int temp;	\
for(temp = length -1; temp>=0; temp--) \
printf("%d\t", myArray[temp]);

int main(void) {
    int myArray[10] = {2, 4, 6, 8, 10, 20, 30, 40, 60, 80};
    int i;
	printArray(myArray, 10);
    printf("\n");
    printReverse(myArray, 10);
}
