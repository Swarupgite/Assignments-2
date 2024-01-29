import java.util.*;

class OnBitProgram 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iNo = scanner.nextInt();

        int modifiedNumber = OnBit(iNo);

        System.out.println("Original Number: " + iNo);
        System.out.println("Modified Number: " + modifiedNumber);

        scanner.close();
    }

    public static int OnBit(int iNo) 
    {
        int bitmask = 1;
        int result = iNo | bitmask;

        return result;
    }
}
