#include <stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

void Display(char chDiv)
{
    switch (chDiv)
    {
    case 'A':
    case 'a':
        printf("Exam time for Division A: 7 AM\n");
        break;
    case 'B':
    case 'b':
        printf("Exam time for Division B: 8:30 AM\n");
        break;
    case 'C':
    case 'c':
        printf("Exam time for Division C: 9:20 PM\n");
        break;
    case 'D':
    case 'd':
        printf("Exam time for Division D: 10:30 PM\n");
        break;
    default:
        printf("Invalid division entered.\n");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the division: ");
    scanf(" %c", &cValue);

    Display(cValue);

    return 0;
}
