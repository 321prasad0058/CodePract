import java.util.*;

public class avg 
{
    public static void avg(int a, int b)     
    {
       int avg = (a + b)/2 ;
       System.out.println("Average of " + a + " and " + b + " is : " + avg);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        avg(a,b);
    }

}