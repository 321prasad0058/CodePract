import java.util.*;

public class disp 
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i =0;

      
        for(i=0;i<=n;i++)
        {
            

            if(i%10==0)
             continue;

             System.out.println(i);
        }
     
    }
    
}
