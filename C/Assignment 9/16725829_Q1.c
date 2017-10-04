#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main()
{
	char msg[200]; //stores the message
	int count = 0, i;
	int space = false;//sets loop for counting spaces to initiate at false
	printf("Please enter a message: ");
	fgets(msg, 200,stdin);//places message into msg array
	for (i = 0; i<strlen(msg);i++)//loop through the message
	{
		if(msg[i] == ' ')//if it finds a space set to false
		space = false;
	else
	{
		if (space == false) //if space is still false increment and set to true
		count++;
		space = true;
	}
	}
	printf("Number of words in message are: %d\n",count); //prints the number of words (spaces)
return 0;
}
