import java.util.*;

class Assignment36 
{
    public String StrNCat(String src, String dest, int iCnt) 
    {
        if (n >= dest.length()) 
        {
            return src + " " + dest;
        } 
        else 
        {
            String concatSubstring = dest.substring(0, n);
            return src + " " + concatSubstring;
        }
    }

    public static void main(String[] args) 
    {
        StringDemo stringDemo = new StringDemo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        System.out.println("Enter the number of characters to concatenate from the second string:");
        int n = scanner.nextInt();

        String result = stringDemo.concatXCharacters(firstString, secondString, n);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
