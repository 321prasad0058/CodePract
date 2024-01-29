import java.util.*;

public class factRecurs
{
    public static void main(String []args)
    {
        factRecurs r = new factRecurs();
        // System.out.println(r.fact(5));
        r.fact(5);
    }

    public static int fact(int n)
    {
        int fact_nm1 = fact(n-1);
        int fact_n = n * fact(n-1);
        return fact_n;
    } 
    
}