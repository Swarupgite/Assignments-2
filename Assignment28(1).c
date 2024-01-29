#include <stdio.h>
#include <ctype.h>
#include <string.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

void Chkchar(char *str, char ch, BOOL *bRet)
{
    while (*str != '\0')
    {
        if (*str == ch)
        {
            *bRet = TRUE;
            break;
        }
        str++;
    }
}

int main()
{
    char arr[20];
    char cValue;

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    printf("Enter character to check: ");
    scanf(" %c", &cValue);

    BOOL bRet = FALSE;
    char *str = arr;
    Chkchar(str, cValue, &bRet);

    if (bRet == TRUE)
    {
        printf("Character '%c' found in the string.\n", cValue);
    }
    else
    {
        printf("Character '%c' not found in the string.\n", cValue);
    }

    return 0;
}
