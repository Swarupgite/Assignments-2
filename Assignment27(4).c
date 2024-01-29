#include <stdio.h>
#include <ctype.h>
#include <string.h>

void Strtogglex(char *str)
{
    printf("Digits from the string: ");
    
    while (*str != '\0')
    {
        if (isdigit(*str))
        {
            printf("%c", *str);
        }
        str++;
    }

    printf("\n");
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    Strtogglex(arr);

    return 0;
}
