import java.util.Scanner;

class Assignment32 
{
    public static String reverseString(String str) 
    {
        StringBuilder reversedString = new StringBuilder(str);
        reversedString.reverse();

        return reversedString.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sobj.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);

        sobj.close();
    }
}
