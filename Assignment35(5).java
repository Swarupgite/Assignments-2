import java.util.*;

class Assignment35
{
    public static long Product(int Arr[]) 
    {
        long iProduct = 1;
        int i = 0;

        for (i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] % 2 != 0)
            {
                iProduct *= Arr[i];
            }
        }
        return iProduct;
    }

    public static void main(String Arg[])
    {
        long iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) 
        {
            Arr[i] = sobj.nextInt();
        }

        iRet = Product(Arr);

        System.out.println("Product of all elements: " + iRet);

        sobj.close();
    }
}
