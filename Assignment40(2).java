import java.util.*;

class Assignment40 
{
    public static void CommonBits(int iNo1, int iNo2) 
    {
        int commonBits = iNo1 & iNo2;
        int position = 1;

        System.out.println("Common ON bit positions:");

        while (commonBits != 0) 
        {
            if ((commonBits & 1) != 0) 
            {
                System.out.println(position);
            }

            commonBits >>>= 1;
            position++;
        }
    }

    public static void main(String arg[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iNo1, iNo2;

        System.out.println("Enter the first number: ");
        iNo1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        iNo2 = scanner.nextInt();

        CommonBits(iNo1, iNo2);

        scanner.close();
    }
}
