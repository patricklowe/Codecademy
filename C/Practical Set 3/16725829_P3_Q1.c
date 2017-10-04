/*
	Practical Set 3 Portfolio
	Arrays - 16725829
*/
#include <stdio.h>

int main (void) {
	int r,c,i,j=0,m=0,k=0,temp=0;
	printf("- - - - - - Creating 2D Array - - - - - - \n");
	printf("\tRows: ");
	scanf("%i", &r);
	printf("\tColumns: ");
	scanf("%i", &c);
	srand(time(NULL));
	
	int arrayA[r][c], arrayB[r][c];	
	//ARRAY A
	printf("\nARRAY A\n");
	for( i = 0; i <r; i++)
	{
	for( j = 0; j <c; j++)
	{
	printf("Enter value for A[%d][%d]: ", i, j);
	scanf("%d", &arrayA[i][j]);
	}
	}
	
	for ( i = 0; i < r; i++ ) {
    for ( j = 0; j < c; j++ ) {
    printf("A[%d][%d] = %d\t", i,j, arrayA[i][j] );
    }
    printf("\n");
   }
	
	//Row Sum
   printf("\nSUM OF ROWS\n");
	for( i = 0; i <r; i++)
	{
	for ( j = 0; j < c; j++ ) {
	temp += arrayA[i][j] + arrayA[i][++j];
	}
	arrayB[i][0] = temp;
	temp = 0;
	}
	for ( i = 0; i < r; i++ ) {
    printf("B[%d][0] = %d\t", i, arrayB[i][0] );
    printf("\n");
   }
   
   //Column Sum
   printf("\nSUM OF COLUMNS\n");
	for(j=0; j<c; j++){
	temp = 0;
	for( i = 0; i <r; i++)
	{
	temp += arrayA[i][j];
	arrayB[0][j] = temp;
	}
	printf("B[0][%d] = %d", j, arrayB[0][j] );
	printf("\n");
	}
   
   //Sum
	printf("\nTOTAL SUM OF A");
	temp = 0;
	for(j=0; j<c; j++){
	for( i = 0; i <r; i++)
	{
	temp += arrayA[i][j];
	arrayB[0][0] = temp;
	}
	}
	printf(" %d\n", arrayB[0][0] );
   
   // Average
   printf("\nAVERAGE OF ROWS\n");
	temp = 0;
	for( i = 0; i <r; i++)
	{
	for ( j = 0; j < c; j++ ) {
	temp += (arrayA[i][j] + arrayA[i][++j]) / c;
	}
	arrayB[i][0] = temp;
	temp = 0;
	}
	for ( i = 0; i < r; i++ ) {
    printf("B[%d]:%d\n", i, arrayB[i][0] );
   }

	printf("\nAVERAGE OF COLUMNS\n");
	for(j=0; j<c; j++){
	temp = 0;
	for( i = 0; i <r; i++)
	{
	temp += arrayA[i][j];
	arrayB[0][j] = temp/r;
	}
	printf("\nB[0][%d] = %d", j, arrayB[0][j] );
	}
	
	printf("\nAVERAGE TOTAL");
	temp = 0;
	int av = r + c;
	for(j=0; j<c; j++){
	for( i = 0; i <r; i++)
	{
	temp += arrayA[i][j];
	arrayB[0][0] = temp / av;
	}
	}
	printf(" %d", arrayB[0][0] );
	
   //random cell value from A
   int q=0,w=0;
   q = rand() % r;
   w = rand() % c;
   printf("\nRandom Cell Value in arrayA = [%d][%d] : %d", q,w, arrayA[q][w]);
   
	return 0;
}
