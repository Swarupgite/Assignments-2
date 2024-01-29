import java.util.*;

class Assignment36
{
    public static boolean StrPallindrome(String str) 
    {
        String lowercaseStr = str.toLowerCase();

        String alphanumericStr = lowercaseStr.replaceAll("[^a-z0-9]", "");

        return alphanumericStr.equals(new StringBuilder(alphanumericStr).reverse().toString());
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        boolean isPalindrome = StrPallindrome(inputString);

        System.out.println("Output: " + isPalindrome);

        scanner.close();
    }
}
    
