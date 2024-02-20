import java.util.*;

public class rev 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number :");

        int n = s.nextInt();
        int num;

        while(n>0)
        {
            num = n%10;
            n= n/10;

            System.out.print( num );
        }

      
    }
}
