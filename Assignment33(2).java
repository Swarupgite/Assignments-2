import java.util.*;

class Assignment33
{
    public static void Display(int Arr[]) 
    {
        System.out.println("Elements divisible by 5: ");
        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] % 5 == 0) 
            {
                System.out.print(Arr[i] + " ");
            }
        }
        System.out.println(); 
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

        Display(Arr);

        sobj.close();
    }
}
