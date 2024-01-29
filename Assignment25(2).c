#include <stdio.h>

void Display(char ch)
{
    if (ch >= 'a' && ch <= 'z')
    {
        printf("Corresponding capital letter: %c\n", ch - ('a' - 'A'));
    }
    else if (ch >= 'A' && ch <= 'Z')
    {
        printf("Corresponding small letter: %c\n", ch + ('a' - 'A'));
    }
    else
    {
        printf("Entered character is not a letter.\n");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the character: ");
    scanf(" %c", &cValue); 

    Display(cValue);

    return 0;
}
