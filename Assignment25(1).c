#include <stdio.h>

void DisplayASCII()
{
    int i = 0;
    printf("ASCII Table\n");
    printf("------------\n");
    printf("| Symbol  | Decimal  | Hexadecimal  | Octal  |\n");
    printf("----------------------------------------\n");

    for (i = 0; i <= 255; ++i) {
        printf("|   %c    |   %-3d   |     %02X      |   %03o   |\n", i, i, i, i);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}
