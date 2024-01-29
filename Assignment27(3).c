#include <stdio.h>
#include <ctype.h>
#include <string.h>

void Strtogglex(char *str)
{
    while (*str != '\0')
    {
        if (islower(*str))
        {
            *str = toupper(*str);
        }
        else if (isupper(*str))
        {
            *str = tolower(*str);
        }

        str++;
    }
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    Strtogglex(arr);

    printf("Modified String is: %s\n", arr);

    return 0;
}
