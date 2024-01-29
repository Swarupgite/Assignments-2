#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    for (int i = 1; i <= iRow; i++) 
    {
        for (int j = 1; j <= iCol; j++) 
        {
            if (j <= iCol - i) 
            {
                printf("* ");
            } 
            else 
            {
                printf("# ");
            }
        }
        printf("\n");
    }
}

int main()
{
    int iNo1 = 0, iNo2 = 0;

    printf("Enter number of rows : \n");
    scanf("%d",&iNo1);

    printf("Enter number of columns : \n");
    scanf("%d",&iNo2);

    Pattern(iNo1, iNo2);

    return 0;
}