#include <stdio.h>
#include <string.h>

int Lastchar(char *str, char ch)
{
    int index = -1;

    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ch)
        {
            index = i;
        }
    }

    return index;
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
    int index = Lastchar(str, cValue);

    if (index != -1)
    {
        printf("Index of last occurrence of character '%c': %d\n", cValue, index);
    }
    else
    {
        printf("Character '%c' not found in the string.\n", cValue);
    }

    return 0;
}
