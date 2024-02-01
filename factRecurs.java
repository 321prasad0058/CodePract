import java.util.*;

public class factRecurs 
{
 public static int fact(int n)
 {
    if(n==0)
    {
    return 1;
    }
    int fnm1 = fact(n-1);
    int f = n * fnm1;
    return f;
 }  

 public static void main(String[] args)
 {
    int n =5;
    fact(n);
    System.out.println(fact(n));
 }

 


}