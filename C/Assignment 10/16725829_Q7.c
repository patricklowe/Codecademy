#include <stdio.h>
#include<stdlib.h>

str msg ="hello"
int main(){
	//declare variable
	int num,i=1,j,k;
	printf("\nEnter an integer:");
	scanf("%d",&num);
	while(i<=num){
		k=0;
		if(num%i==0){
		j=1;
	while(j<=i){
		if(i%j==0)
		k++;
		j++;
		}
	if(k==2)
		printf("\n%d is a prime factor",i);
	}
		i++;
	}
		return 0;
}
