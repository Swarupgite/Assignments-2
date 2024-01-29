import java.util.*;

class Assignment33
{
    public static int Difference(int Arr[]) 
    {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] % 2 == 0) 
            {
                sumEven += Arr[i];
            } 
            else 
            {
                sumOdd += Arr[i];
            }
        }

        return sumEven - sumOdd;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        System.out.println("Enter the number of elements: ");
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        for (iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        int result = Difference(Arr);

        System.out.println("The difference between the summation of even and odd elements is: " + result);

        sobj.close();
    }
}
