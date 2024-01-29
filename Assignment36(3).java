import java.util.*;

class Assignment36 
{
    public static boolean StrNCmpX(String str1, String str2, int n) 
    {
        if (n >= str2.length()) 
        {
            return str1.equals(str2);
        }

        String substring1 = str1.substring(0, n);
        String substring2 = str2.substring(0, n);

        return substring1.equals(substring2);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        System.out.println("Enter the number of characters to compare:");
        int n = scanner.nextInt();

        boolean areEqual = StrNCmpX(firstString, secondString, n);

        System.out.println("Output: " + areEqual);

        scanner.close();
    }
}
