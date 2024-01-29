#include <stdio.h>

void Display(char ch)
{
    if (ch >= 'A' && ch <= 'Z')
    {
        for (char i = ch; i <= 'Z'; ++i)
        {
            printf("%c ", i);
        }
    }
    else if (ch >= 'a' && ch <= 'z')
    {
        for (char i = ch; i >= 'a'; --i)
        {
            printf("%c ", i);
        }
    }
    else
    {
        printf("Entered character is not a letter.\n");
    }

    printf("\n");
}

int main()
{
    char cValue = '\0';

    printf("Enter the character: ");
    scanf(" %c", &cValue);

    Display(cValue);

    return 0;
}
