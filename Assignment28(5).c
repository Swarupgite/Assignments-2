#include <stdio.h>
#include <string.h>

void StrRev(char *str)
{
    int length = strlen(str);
    
    for (int i = 0, j = length - 1; i < j; i++, j--)
    {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

int main()
{
    char arr[20];

    printf("Enter string: ");
    scanf("%[^\n]s", arr);

    StrRev(arr);

    printf("Reversed String is: %s\n", arr);

    return 0;
}
