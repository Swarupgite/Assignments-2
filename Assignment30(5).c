#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

typedef struct Node NODE;
typedef struct Node *PNODE;
typedef struct Node **PPNODE;

void InsertFirst(PPNODE Head, int No)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->next = NULL;

    if (*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        newn->next = *Head;
        *Head = newn;
    }
}

void Display(PNODE Head)
{
    printf("Contents of Linked List: ");

    while (Head != NULL)
    {
        printf("| %d | -> ", Head->data);
        Head = Head->next;
    }
    printf("NULL\n");
}

int Count(PNODE Head)
{
    int iCnt = 0;

    while (Head != NULL)
    {
        iCnt++;
        Head = Head->next;
    }
    return iCnt;
}

int SumOfDigits(int num)
{
    int sum = 0;

    while (num != 0)
    {
        sum += num % 10;
        num /= 10;
    }

    return sum;
}

void DisplaySumOfDigits(PNODE Head)
{
    printf("Sum of Digits for each element in Linked List: ");

    while (Head != NULL)
    {
        printf("%d -> ", SumOfDigits(Head->data));
        Head = Head->next;
    }

    printf("NULL\n");
}

int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 123);
    InsertFirst(&First, 456);
    InsertFirst(&First, 789);
    InsertFirst(&First, 10);
    InsertFirst(&First, 987);
    InsertFirst(&First, 543);

    Display(First);
    iRet = Count(First);
    printf("Number of nodes are: %d\n", iRet);

    DisplaySumOfDigits(First);

    return 0;
}
