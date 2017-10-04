#include <ctype.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main()
{
	char msg[200];
	int count = 0, i;
	int space = false;
	printf("Please enter a message: ");
	scanf("%s", &msg);
	printf(reformat_string;

return 0;
}



void reformat_string(char *src, char *dst) {
    for (; *src; ++src)
        if (!ispunct((unsigned char) *src))
            *dst++ = tolower((unsigned char) *src);
    *dst = 0;
}
