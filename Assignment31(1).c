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

int ReverseNumber(int num)
{
    int reversedNum = 0;

    while (num != 0)
    {
        reversedNum = reversedNum * 10 + num % 10;
        num /= 10;
    }

    return reversedNum;
}

void Reverse(PNODE Head)
{
    printf("Reversed Elements in Linked List: ");

    while (Head != NULL)
    {
        int reversedElement = ReverseNumber(Head->data);
        printf("| %d | -> ", reversedElement);
        Head = Head->next;
    }

    printf("NULL\n");
}

int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 89);
    InsertFirst(&First, 6);
    InsertFirst(&First, 41);
    InsertFirst(&First, 17);
    InsertFirst(&First, 28);
    InsertFirst(&First, 11);

    Display(First);
    iRet = Count(First);
    printf("Number of nodes are: %d\n", iRet);

    Reverse(First);

    return 0;
}
