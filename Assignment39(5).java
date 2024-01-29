import java.util.*;

class Assignment39 
{
    public static int ToggleBit(int iNo) 
    {
        int firstNibbleMask = 0xF0000000;
        int lastNibbleMask = 0x0000000F; 

        int firstNibble = (iNo & firstNibbleMask) >>> 28;
        int lastNibble = iNo & lastNibbleMask;

        int toggledNumber = iNo ^ (firstNibbleMask | lastNibbleMask);

        toggledNumber |= (firstNibble << 24) | lastNibble;

        return toggledNumber;
    }

    public static void main(String arg[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int inputNumber, modifiedNumber;

        System.out.println("Enter a number: ");
        inputNumber = scanner.nextInt();

        modifiedNumber = ToggleBit(inputNumber);

        System.out.println("Modified Number: " + modifiedNumber);

        scanner.close();
    }
}
