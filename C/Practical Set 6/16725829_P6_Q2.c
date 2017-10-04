// Student GPA Ranking
#include <stdio.h>
#include <string.h>
#define STUDENTS 6

struct person {
	unsigned int studentNum;
	char lastName[15];
	char firstName[10];
	char fieldOfStudy[50];
	int age;
	char sex; //m or f
	double gpa;
	int rank;
}student[6];

int main(void){
	int i;
	
	for(i=0; i<6; i++){
	printf("- - Student %d Details - -", i+1);
	student[i].rank = i;

	fflush(stdin);
	printf("\nEnter Student Number: ");
	scanf("%d", &student[i].studentNum);
	
	fflush(stdin);
	printf("Enter Last Name: ");
	scanf("%s", &student[i].lastName);
	
	fflush(stdin);
	printf("Enter First Name: ");
	scanf("%s", &student[i].firstName);
	
	fflush(stdin);
	printf("Enter Field of Study: ");
	scanf("%s", &student[i].fieldOfStudy);
	
	fflush(stdin);
	printf("Enter Age: ");
	scanf("%d", &student[i].age);
	
	fflush(stdin);
	printf("Enter Gender(m or f):");
	scanf("%c", &student[i].sex);
	
	fflush(stdin);
	printf("Enter GPA: ");
	scanf("%d", &student[i].gpa);
	}
*/	
	//compare students gpa
	int j;
	for(i=0; i<6; i++){
		
	for(j=1; j<6; j++){
	if(student[i].gpa > student[j].gpa){
//   		 student[i].rank;
   	}
   
   else if(student[i].gpa < student[j].gpa){
    student[i].rank++;
    student[j].rank--;
   }
}
}
	
	// print students
	for(i=0; i<6; i++){
	printf("\nStudent %d Number: %d", i+1, student[i].studentNum);
	printf("\nName: %s %s", i+1, student[i].firstName, student[i].lastName);
	printf("\nAge: %d", i+1, student[i].age);
	printf("\nField of Study: %s", i+1, student[i].fieldOfStudy);
	printf("\nGender: %c", i+1, student[i].sex);
	printf("\nGPA: %d", i+1, student[i].gpa);
	printf("\nRank: %d\n", i+1, student[i].rank);
	}
}
}


