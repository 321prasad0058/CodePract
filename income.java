import java.util.*;

public class income 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your Income :");

        float inc = s.nextFloat();
        float tax;

        if(inc<=500000)
        {
            tax = 0;
            System.out.println("Zero Taxes");
        }

        if(inc>=500000 && inc<=1000000)
        {
            tax = 0.2f * inc;
            System.out.println("The tax is : " + tax);
        }

        if(inc>=1000000)
        {
            tax = 0.3f * inc;
            System.out.println("The tax is : " + tax);
        }
    }
}