import java.util.*;

class Assignment35
{
    public static int LastOcc(int Arr[], int iNo) 
    {
        int i = 0;
        for (i = Arr.length - 1; i >= 0; i--) 
        {
            if (Arr[i] == iNo) 
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String Arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) 
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter a number to find its index: ");
        int iNo = sobj.nextInt();

         iRet = LastOcc(Arr, iNo);

        if (iRet != -1) 
        {
            System.out.println("Index of the first occurrence of " + iNo + " is: " + iRet);
        } 
        else 
        {
            System.out.println(iNo + " is not present in the array.");
        }

        sobj.close();
    }
}
