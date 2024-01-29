#include <stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

void ChkSpecial(char ch)
{
    if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))
    {
        printf("%c is a special symbol.\n", ch);
    }
    else
    {
        printf("%c is not a special symbol.\n", ch);
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the Special character: ");
    scanf(" %c", &cValue);

    ChkSpecial(cValue);

    return 0;
}
