import java.util.*;

class Assignment39 
{
    public static int OFFBIT(int iNo, int iPos)
     {
        int iMask = 0x00000001;
        int iResult = 0;

        iMask = iMask << (iPos - 1);
        iMask = ~iMask;
        iResult = iNo & iMask;

        return iResult;
    }

    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iPos = 0, modifiedNumber = 0;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the position : ");
        iPos = sobj.nextInt();

        modifiedNumber = OFFBIT(iNo, iPos);

        System.out.println("Modified Number: " + modifiedNumber);
    }
}
