import java.util.*;

public class nthFibo 
{
    public static void main(String[] args)
    {
        System.out.println(fibo(8));
    }

    public static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        
        if(n==1)
        {
            return 1;
        }

        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int f = fnm1 + fnm2;
        return f;
    }
}