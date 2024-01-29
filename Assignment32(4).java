import java.util.*;

class Assignment32 
{
    public static boolean ChkVowel(String str) 
    {
        for (char ch : str.toCharArray()) 
        {
            if ("aeiouAEIOU".indexOf(ch) != -1) 
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = sobj.nextLine();

        boolean hasVowel = ChkVowel(inputString);

        if (hasVowel) 
        {
            System.out.println("The string contains a vowel.");
        } 
        else 
        {
            System.out.println("The string does not contain any vowel.");
        }

        sobj.close();
    }
}
