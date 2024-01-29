import java.util.*;

class Assignment34
{
    public static int Multiply(int iNo) 
    {
        int iresult = 1;

        while (iNo > 0) 
        {
            int digit = iNo % 10;
            iresult *= digit;
            iNo /= 10;
        }

        return iresult;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = sobj.nextInt();

        iRet = Multiply(inputNumber);

        System.out.println("Multiplication of all digits: " + iRet);

        sobj.close();
    }
}
