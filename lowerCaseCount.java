import java.util.*;

public class lowerCaseCount
{
    public static void lowerCaseCount(String str)
    {
        int count =0;
        for(int i = 0; i< str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'|| ch == 'e' || ch == 'i' || ch== 'o' || ch=='u')
            {
                count++;
            }
        }    
        System.out.print(count);
    }

    public static void main(String[] args)
    {
        String str = "hello, my name is prasad anil alai";
        lowerCaseCount(str);
    }
}