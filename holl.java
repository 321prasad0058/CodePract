import java.util.*;

public class holl
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        for(int i =1; i<=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(i>j && j%i!=1)
                {
               System.out.print("0");
                }    

                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}