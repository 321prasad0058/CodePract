import java.util.*;

public class anagrams
{
    public static void main(String[] args)
    {
        String str1 = "earth";
        String str2 = "eartl";

        // Converting to lowerCase so that we don't have to compare seperately for UpperCase and LowerCase
        str1= str1.toLowerCase();
        str2= str2.toUpperCase();

        // Checking if length of both the strings are same 
        if(str1.length()==str2.length())
        {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            // Sorting the array in alphabetical order for comparing
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            //Checking for equality
            boolean result = Arrays.equals(ch1, ch2);
            if(result)
            {
                System.out.println("Anagrams");
            }
            else
            {
                System.out.println("Not an Anagram");
            }
        }

        // When lengths are not equal
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}