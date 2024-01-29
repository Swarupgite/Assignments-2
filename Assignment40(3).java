import java.util.*;

class Assignment40 
{
    public static boolean ChkBit(int iNo)
    {
        int bit9Mask = 1 << 8;
        int bit12Mask = 1 << 11; 

        return ((iNo & bit9Mask) != 0) || ((iNo & bit12Mask) != 0);
    }

    public static void main(String arg[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int iNo;
        boolean result;

        System.out.println("Enter a number: ");
        iNo = scanner.nextInt();

        result = ChkBit(iNo);

        if (result) 
        {
            System.out.println("TRUE");
        } else 
        {
            System.out.println("FALSE");
        }

        scanner.close();
    }
}
