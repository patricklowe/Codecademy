// print size of each variable type below
#include <stdio.h>

int main(){
	//setup variables
	char c = 'a';
	int int1 = 10;
	long l1 = 1234567;
	long long ll1 = 213456789076543;
	double d1 = 1.0;
	long double ld1 = 234.3423224;
	float f1 = 3.33;
	int arr1[5] ={1,2,3,4,5};
	int ptr1;
	
	// print variables
	printf("Char Size: %d", sizeof(c));
	printf("\nint Size: %d", sizeof(int1));
	printf("\nlong Size: %d", sizeof(l1));
	printf("\nlong long Size: %d", sizeof(ll1));
	printf("\ndouble Size: %d", sizeof(d1));
	printf("\nlong double Size: %d", sizeof(ld1));
	printf("\nfloat Size: %d", sizeof(f1));
	printf("\narray Size: %d", sizeof(arr1));
	printf("\npointer Size: %d", sizeof(ptr1));
	
}
