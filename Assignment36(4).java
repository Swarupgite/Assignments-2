import java.util.*;

class Assignment36 
{
    public static String StrRevTogX(String str) 
    {
        StringBuilder reversedAndToggled = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) 
        {
            char currentChar = str.charAt(i);

            if (Character.isUpperCase(currentChar)) 
            {
                reversedAndToggled.append(Character.toLowerCase(currentChar));
            } 
            else if (Character.isLowerCase(currentChar)) 
            {
                reversedAndToggled.append(Character.toUpperCase(currentChar));
            }
             else
            {
                reversedAndToggled.append(currentChar);
            }
        }

        return reversedAndToggled.toString();
    }


    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        String reversedAndToggled = StrRevTogX(inputString);

        System.out.println("Output: " + reversedAndToggled);

        scanner.close();
    }

}
