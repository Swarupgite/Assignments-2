#include<stdio.h>

#define TRUE 1 
#define FALSE 0

typedef int BOOL;

BOOL ChkSmall(char ch)
{
    if ((ch >= 97 && ch <= 122))
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}
int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character : ");
    scanf("%c",&cValue);

    bRet = ChkSmall(cValue);

    if(bRet == TRUE)
    {
        printf("It is Small case character");
    }
    else
    {
        printf("It is not Small case character");
    }
    return 0;
}