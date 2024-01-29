#include <stdio.h>
#include <ctype.h>
#include <string.h>

void Strlwrx(char *str)
{
    while (*str != '\0')
    {
        *str = tolower(*str);
        str++;
    }
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    Strlwrx(arr);

    printf("Modified String is: %s\n", arr);

    return 0;
}
