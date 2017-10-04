/* 	Retro Music Store
	Patrick Löwe
	16725829 		*/
#include "stdio.h"
#include "malloc.h"
#include "stdlib.h"
#include "string.h"
#include "conio.h"

void Create();
void List();
void Ratio();
void Search();
void Copy();
int iCounter = 0; // Starting at 0 
char sBlank[2]= ", ";
char sLine[49+1];
char sCopy[49+1];
// Record Structure
struct recData {
	const char* Number;
	const char Title[15];
	const char Artist[10];
	const char Year[5];
	const char Borrowed[4];
	const char Customer[26];	
	const char Date[11];
};

struct recData *pRecord; // Pointer notation

int main(void)
{
	int iOpt;
	
	printf("Select an Option:\n");
	printf("1.\tCreate\n");
	printf("2.\tList All Records\n");
	printf("3.\tRatio\n");
	printf("4.\tSearch\n");
	printf("5.\tCopy to File\n");
	scanf("%d", &iOpt);
	
	switch(iOpt){
	case 1:
		Create();
		break;
	case 2: 
		List();
		break;
	case 3:
		Ratio();
		break;
	case 4:
		Search();
		break;
	case 5:
		Copy();
		break;
	default:
		printf("\nInvalid Entry!\n");
		break;
	}
	
}

void Create(){
		// Initialise memory space
	pRecord = (struct recData *) malloc(sizeof(struct recData));
	FILE * fp; // Write to file
	fp = fopen ("database.txt","w+"); // Writes to the file 'Database.txt'
		fflush(stdin);
		puts("\nEnter Record Number: ");
		scanf("%s", pRecord->Number); // Stores clients first name
		
		fflush(stdin);
		puts("\nEnter Record Title: ");
		scanf("%s", pRecord->Title); // Stores clients last name
		
		fflush(stdin);
		puts("\nEnter Artist: ");
		scanf("%s", pRecord->Artist); // Stores clients age
		
		fflush(stdin);
		puts("\nEnter Year of Record");
		scanf("%s", pRecord->Year); // Stores clients address
		
		fflush(stdin);
		puts("\nIs Record Currently Borrow?(yes/no): ");
		scanf("%s", pRecord->Borrowed); // Stores clients phone number
		
		fflush(stdin);
		puts("\nEnter Customer Name: ");
		scanf("%s", pRecord->Customer);
		
		fflush(stdin);
		puts("\nEnter Date: ");
		scanf("%s", pRecord->Date);
		
		printf("\n\tHERE1");
		strcpy(sLine,pRecord->Number); // Prints clients First name
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Title); // Prints clients Last name
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Artist); // Prints clients Age
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Year); // Prints clients Address
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Borrowed); // Prints clients Number
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Customer); // Prints clients account type
		strcat(sLine, sBlank);
		strcat(sLine,pRecord->Date); // Prints clients account type
		
		printf("%s", sLine);
		printf("\n\tHERE2");
		
		fprintf(fp,"%s \n", sLine); // Prints each string and creates in 'database.txt' file also
		
		printf("\n\tHERE3");
		
		strcpy(sLine,sBlank);
		printf("\n\tHERE4");

fclose(fp); // Close the 'database.txt' file to stop writing
}

void List(){
	FILE *fp; // Write to file
		char buf[560]; // Prints upto 260 characters
		
		fp = fopen ("database.txt", "r"); // Opens the database.txt file to be read
		if(!fp){
		printf("FAILED");
		}
		while (fgets(buf,560, fp)!=NULL)
        		printf("\n \t %s",buf); // Prints the database file with a limit of 260 characters
        		printf("\n Press Any Key To Continue \n");

		fclose(fp); // Closes the database.txt file
}

void Ratio(){
	
}

void Search(){
	// not fully working
/*	FILE *fp;
	if((fp = fopen("database.txt", "wb")) == NULL){
		printf("\nError Opening File\n");
	}
	else{
	struct recData Record = { 0, "", "", 0, "", "", 0};
	
	printf("Enter account Number: ");
	scanf("%d", &Record.Number);
	
	while(Record.Number != 0){
	printf("\nEnter Title, Artist, Year, Borrowed, Customer, and Date:\n ");
	fscanf(stdin, "%14s%9%lf%3s%25s%10s", Record.Title, Record.Artist, Record.Year, Record.Borrowed, Record.Customer, Record.Date);
	
	fseek(fp, (Record.Number - 1) * 
	sizeof(struct recData), SEEK_SET);
	
	fwrite(&Record, sizeof(struct recData), 1, fp);
	}
	fclose(fp);
	}
*/}

void Copy(){
	FILE *fp; // Write to file
		char buf[560]; // Prints upto 260 characters
		
		fp = fopen ("database.txt", "r"); // Opens the database.txt file to be read
		if(!fp){
		printf("FAILED");
		}
		while (fgets(buf,560, fp)!=NULL)
        	strcat(sCopy, buf);
		fclose(fp); // Closes the database.txt file
	FILE * fp; // Write to file
	fp = fopen ("database.txt","w+"); 
	fprintf(fp,"%s \n", sCopy);
}
