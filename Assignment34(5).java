import java.util.*;

class Assignment34
{
    public static int calculateDifference(int iNo) 
    {
        int sumEven = 0;
        int sumOdd = 0;

        while (iNo > 0) 
        {
            int digit = iNo % 10;

            if (digit % 2 == 0) 
            {
                sumEven += digit;
            } 
            else 
            {
                sumOdd += digit;
            }

            iNo /= 10;
        }

        return sumEven - sumOdd;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = sobj.nextInt();

        iRet = calculateDifference(inputNumber);

        System.out.println("Difference between summation of even digits and summation of odd digits: " + iRet);

        sobj.close();
    }
}
