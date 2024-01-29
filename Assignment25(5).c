#include <stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

void ChkSpecial(char ch)
{
    printf("Character: %c\n", ch);
    printf("ASCII Decimal: %d\n", ch);
    printf("ASCII Octal: %o\n", ch);
    printf("ASCII Hexadecimal: %X\n", ch);
}
int main()
{
    char cValue = '\0';

    printf("Enter the Special character: ");
    scanf(" %c", &cValue);

    ChkSpecial(cValue);

    return 0;
}
