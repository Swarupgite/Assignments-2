import java.util.*;

class Assignment34
{
    public static int CountRange(int iNo) 
    {
        int iCount = 0;

        while (iNo > 0) 
        {
            int digit = iNo % 10;

            if (digit > 3 && digit < 7) 
            {
                iCount++;
            }

            iNo /= 10;
        }

        return iCount;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = sobj.nextInt();

        iRet = CountRange(inputNumber);

        System.out.println("Count of digits between 3 and 7 : " +iRet);

        sobj.close();
    }
}
