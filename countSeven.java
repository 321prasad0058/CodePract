import java.util.*;

public class countSeven
{
    public static void countSeven(int a[][])
    {
        int cnt =0;

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                if(a[i][j]==7)
                {
                    cnt++;
                }    
            }
            
        }
        System.out.print("7 occurs " + cnt + " times ");
    }

    public static void main(String[] args)
    {
        int a[][] = {{4,7,8},{8,8,7} };
        countSeven(a);
    }
}