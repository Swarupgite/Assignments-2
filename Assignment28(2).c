#include <stdio.h>
#include <ctype.h>
#include <string.h>


int Countchar(char *str, char ch)
{
    int frequency = 0;

    while (*str != '\0')
    {
        if (*str == ch)
        {
            frequency++;
        }
        str++;
    }

    return frequency;
}

int main()
{
    char arr[20];
    char cValue;

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    printf("Enter character to check: ");
    scanf(" %c", &cValue);

    char *str = arr;
    int frequency = Countchar(str, cValue);

    printf("Frequency of character '%c' in the string: %d\n", cValue, frequency);

    return 0;
}
