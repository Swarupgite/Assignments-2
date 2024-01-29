import java.util.*;

class Assignment40 
{
    public static int ToggleBitRange(int iNo, int iStart, int iEnd) 
    {
        if (iStart < 1 || iEnd > 32 || iStart > iEnd) 
        {
            System.out.println("Invalid range");
            return iNo;
        }

        int mask = ((1 << (iEnd - iStart + 1)) - 1) << (iStart - 1);
        return iNo ^ mask;
    }

    public static void main(String arg[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iNo, iStart, iEnd, modifiedNumber;

        System.out.println("Enter a number: ");
        iNo = scanner.nextInt();

        System.out.println("Enter the start position: ");
        iStart = scanner.nextInt();

        System.out.println("Enter the end position: ");
        iEnd = scanner.nextInt();

        modifiedNumber = ToggleBitRange(iNo, iStart, iEnd);

        System.out.println("Modified Number: " + modifiedNumber);

        scanner.close();
    }
}
