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

int FindSecondMaxElement(PNODE Head)
{
    if (Head == NULL || Head->next == NULL)
    {
        printf("Not enough elements to find the second maximum element.\n");
        return -1;
    }

    int max1 = Head->data;
    int max2 = Head->next->data;

    while (Head != NULL)
    {
        if (Head->data > max1)
        {
            max2 = max1;
            max1 = Head->data;
        }
        else if (Head->data > max2 && Head->data != max1)
        {
            max2 = Head->data;
        }

        Head = Head->next;
    }

    return max2;
}

int main()
{
    PNODE First = NULL;
    int iRet = 0;

    InsertFirst(&First, 70);
    InsertFirst(&First, 60);
    InsertFirst(&First, 50);
    InsertFirst(&First, 28);
    InsertFirst(&First, 30);
    InsertFirst(&First, 19);
    InsertFirst(&First, 10);

    Display(First);
    iRet = Count(First);
    printf("Number of nodes are: %d\n", iRet);

    int secondMaxElement = FindSecondMaxElement(First);

    if (secondMaxElement != -1)
        printf("Second maximum element in the linked list: %d\n", secondMaxElement);

    return 0;
}
