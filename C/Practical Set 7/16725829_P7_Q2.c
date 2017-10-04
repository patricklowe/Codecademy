/* Dynamically allocate memory based on 2 txt files
Not really clear on what to do here so im going to create an array that stores the visits to 
that website per day in the array*/
#include <stdio.h>
#include <stdlib.h>

int myArray1;
int visitors;

int main(void){
	FILE *cfPtr;
	
	if ((cfPtr = fopen("transactions1.txt", "rb")) == NULL){
		puts("File cant be opened");
	}
	
	else{
		printf("Numbers");
		
		while(!feof(cfPtr)) {
			int fil = "";
			int result = fread(&fil ,sizeof(fileNum) ,1,cfPtr)
			
			if(result != 0 ){
				printf("%d\n");
			}
		}
		fclose(cfPtr);
	}
	
	// read file contents into array
	
	
	//print the array of elements
	
	//reallocate memory to include trans2 contents in the same array
	
	
}




