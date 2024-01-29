#include<stdio.h>

void Pattern(int iRow, int iCol)
{
   int i = 0, j = 0;

   for(i = 1; i <= iRow; i++)
   {
    for(j = 1; j <= iCol; j++)
   {
    if(i == j)
    {
        printf("$\t",j);
    }
    else
    {
        printf("*\t");
    }
   }
   printf("\n\n");
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