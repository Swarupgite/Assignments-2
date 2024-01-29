import java.util.*;

class Assignment34
{
    public static int CountOdd(int iNo) 
    {
        int iCnt = 0;

        while (iNo > 0) 
        {
            int digit = iNo % 10;

            if (digit % 2 != 0) 
            {
                iCnt++;
            }

            iNo /= 10;
        }

        return iCnt;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = sobj.nextInt();

        iRet = CountOdd(inputNumber);

        System.out.println("Count of even digits: " +iRet);

        sobj.close();
    }
}
