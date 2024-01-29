import java.util.*;

class Assignment40 
{
    public static int CountOne(int iNo) 
    {
        int iCount = 0;

        while (iNo != 0)
         {
            iCount += iNo & 1;
          
            iNo >>>= 1;
        }

        return iCount;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo, iCount;

        System.out.println("Enter a number: ");
        iNo = sobj.nextInt();

        iCount = CountOne(iNo);

        System.out.println("Number of ON bits: " + iCount);

        sobj.close();
    }
}
