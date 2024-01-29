import java.util.*;

class Assignment35
{
    public static boolean Check(int Arr[], int iNo) 
    {
        for (int iCnt : Arr) 
        {
            if (iCnt == iNo) 
            {
                return true;
            }
        }
            return false;
    }

    public static void main(String Arg[])
    {
        boolean iRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) 
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter another number to check: ");
        int targetNumber = sobj.nextInt();

        iRet = Check(Arr, targetNumber);

        if (iRet = true) 
        {
            System.out.println(targetNumber + " is present in the array.");
        } 
        else 
        {
            System.out.println(targetNumber + " is not present in the array.");
        }

        sobj.close();
    }
}
