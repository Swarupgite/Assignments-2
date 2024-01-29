#include <stdio.h>
#include <ctype.h>
#include <string.h>

void Struprx(char *str)
{
    while (*str != '\0')
    {
        *str = toupper(*str);
        str++;
    }
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    Struprx(arr);

    printf("Modified String is: %s\n", arr);

    return 0;
}
