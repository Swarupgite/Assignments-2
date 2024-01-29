import java.util.*;

class Assignment38 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iNo = scanner.nextInt();

        int modifiedNumber = OffBit(iNo);

        System.out.println("Original Number: " + iNo);
        System.out.println("Modified Number: " + modifiedNumber);

        scanner.close();
    }

    public static int OffBit(int iNo) 
    {
        int bitmask = ~(1 << 6);
        int result = iNo & bitmask;

        return result;
    }
}
