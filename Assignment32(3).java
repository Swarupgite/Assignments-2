import java.util.*;

class Assignment32 
{
    public static int CountDiff(String str) 
    {
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) 
        {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') 
            {
                upperCaseCount++;
            } else if (charArray[i] >= 'a' && charArray[i] <= 'z') 
            {
                lowerCaseCount++;
            }
        }

        return lowerCaseCount-upperCaseCount;
    }

    public static void main(String[] args) 
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String inputString = sobj.nextLine();

        iRet = CountDiff(inputString);
        System.out.println("The Difference is : "+iRet);

        sobj.close();
    }
}
