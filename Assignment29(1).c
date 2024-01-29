#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

typedef struct Node NODE;
typedef struct Node * PNODE;
typedef struct Node ** PPNODE;

void InsertFirst(PPNODE Head, int No)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->next = NULL;

    if(*Head == NULL) 
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
    printf("Contents of Linked List : \n");

    while(Head != NULL)
    {
        printf("| %d | -> ", Head->data);
        Head = Head->next;
    }
    printf("NULL\n");
}

int Count(PNODE Head)
{
    int iCnt = 0;

    while(Head != NULL)
    {
        iCnt++;
        Head = Head->next;
    }
    return iCnt;
}

int SearchFirstOcc(PNODE Head, int element)
{
    int position = 1;

    while (Head != NULL)
    {
        if (Head->data == element)
        {
            return position;
        }
        position++;
        Head = Head->next;
    }

    return -1; 
}

int main()
{
    PNODE First = NULL;
    int iRet = 0, elementToFind;

    InsertFirst(&First, 70);
    InsertFirst(&First, 60);
    InsertFirst(&First, 50);
    InsertFirst(&First, 40);
    InsertFirst(&First, 30);
    InsertFirst(&First, 20);
    InsertFirst(&First, 10);

    Display(First);
    iRet = Count(First);
    printf("Number of nodes are : %d\n", iRet);

    printf("Enter the element to find: ");
    scanf("%d", &elementToFind);

    int position = SearchFirstOcc(First, elementToFind);

    if (position != -1)
        printf("Element %d found at position %d\n", elementToFind, position);
    else
        printf("Element %d not found in the linked list\n", elementToFind);

    return 0;
}
