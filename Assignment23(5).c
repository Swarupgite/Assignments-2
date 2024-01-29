#include <stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;

    for (i = 1; i <= iRow; i++)
    {
        for (j = 1; j <= iCol; j++)
        {
            if (i == 1 || i == iRow || j == 1 || j == iCol)
            {
                printf("%-3d", j);
            }
            else if (i == 2 && j == iCol - 1)
            {
                printf("   ");
            }
            else if (i == 3 && j == iCol - 2)
            {
                printf("   ");
            }
            else if (i == 4 && j == iCol - 3)
            {
                printf("   ");
            }
            else if (i == iRow - 1 && j == 2)
            {
                printf("   ");
            }
            else
            {
                printf("   ");
            }
        }
        printf("\n");
    }
}


int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns: ");
    scanf("%d %d", &iValue1, &iValue2);

    Pattern(iValue1, iValue2);

    return 0;
}
