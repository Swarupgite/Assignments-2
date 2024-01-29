#include <stdio.h>
#include <ctype.h>
#include <string.h>

void CountWhite(char *str)
{
    int spaceCount = 0;

    while (*str != '\0')
    {
        if (isspace(*str))
        {
            spaceCount++;
        }
        str++;
    }

    printf("Number of white spaces in the string: %d\n", spaceCount);
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    CountWhite(arr);

    return 0;
}
