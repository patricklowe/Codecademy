#include <stdio.h>
#include <string.h>
 
char str[35], sub[5]; // stores up to 35 characters in message, and searches up to 5 characters
int count = 0, count1 = 0;
 
int main(void)
{
    int i, j, l, M1, M2;
 
    printf("\nEnter a message: ");
    scanf("%[^\n]s", str); //takes in a message including spaces
 
    M1 = strlen(str);//add string length into M1, message 1
 
    printf("\nSearch for word: ");//captures string to search for
    scanf(" %[^\n]s", sub); //search for string including spaces
 
    M2 = strlen(sub);//put substring (search word) into M2, message 2
 
    for (i = 0; i < M1;)//loop through M1 for word
    {
        j = 0;
        count = 0;//times it loops through 
        while ((str[i] == sub[j]))
        {
            count++;//increment for each search
            i++;
            j++;
        }
        if (count == M2)//if word is found, count it
        {
            count1++;//hold number of occurences for the word    
            count = 0;
        }
        else
            i++;
    }    
    printf("\nThe word %s occurs %d times in %s", sub, count1, str);//prints the total times the word occurs
}
