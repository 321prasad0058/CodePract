import java .util.*;

public class larg 
{

    public static void main(String[] args) 
    {   
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println(a + " is the Largest" );
            }
            else 
            {
                System.out.println(c + " is the largest");
            }
        }
        else 
        {
            if(b>=c)
            {
                System.out.println(b + " is the largest");
            }
            else
            {
                System.out.println(c + " is the largest");
            }
        }
        
    }

}