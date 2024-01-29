import java.util.*;

class Assignment36
{
    public static boolean StrCmpX(String str1, String str2) 
    {
        return str1.equals(str2);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        boolean areEqual = StrCmpX(firstString, secondString);

        System.out.println("Output: " + areEqual);

        scanner.close();
    }

   
}
