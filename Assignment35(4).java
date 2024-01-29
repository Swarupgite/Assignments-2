import java.util.*;

class Assignment35
{
    public static void Display(int Arr[], int startRange, int endRange) 
    {
        System.out.println("Elements in the specified range [" + startRange + ", " + endRange + "]: ");

        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] >= startRange && Arr[i] <= endRange) 
            {
                System.out.print(Arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size = sobj.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) 
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the start range: ");
        int startRange = sobj.nextInt();

        System.out.println("Enter the end range: ");
        int endRange = sobj.nextInt();

        Display(Arr, startRange, endRange);

        sobj.close();
    }
}
