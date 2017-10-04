/*
	Stadium Counter
	16725829
*/
#include <stdio.h>
int enterStadium();
int leaveStadium();
int profit();
int printCurrent();
int capacity;

int main(void){
	char iOpt;
	int audience, profit;
	printf("Enter Stadium Capacity: ");
	scanf("%d", &capacity);
	fflush(stdin);
do{	
	printf("- - - Menu - - -");
	printf("\n1. Entry");
	printf("\n2. Exit");
	printf("\n3. Current Audience & Profit\n");
	fflush(stdin);
	scanf("%c", &iOpt);
	
	switch(iOpt){
	case '1':
		audience = enterStadium(audience);
		break;
	case '2':
		audience = leaveStadium(audience);
		break;
	case '3':
		printCurrent(audience);
		break;
	default:
		printf("\n \t Invalid Entry!");
	} 
	/* Generate options menu */
	printf("\n \n Do you wish to continue(Y/N):\t ");
	scanf("\n %c", &iOpt);	
	system("cls");
}	/* End of Do */
	while(iOpt == 'y');
	

return 0;
}


int enterStadium(int a)
{
	system("CLS");
	printf("Entering Stadium...");
	++a;
	printf("\nStadium Audience: %d", a);
	stadiumProfit(a);
	return(a);
}

int stadiumProfit(int a)
{
	int p;
	p = a * 20;
	printf("\nProfit: %d", p);
	return(p);
}

int leaveStadium(int a){
	printf("Leaving Stadium...");
	--a;
	printf("\nStadium Audience: %d", a);
	return (a);
}

int printCurrent(int a, int p){
	printf("Current Status...");
	printf("\nStadium Audience: %d", a);
	printf("\nStadium Intake: %d", p);
}
