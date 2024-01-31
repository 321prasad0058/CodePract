import java.util.Arrays;
import java.util.Collections;


public class inbuiltArray
{
    public static void printArray(Integer a[])
    {
        for(Integer i =0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Integer a[] = {5,4,1,3,2};
        
        Arrays.sort(a,Collections.reverseOrder());

        printArray(a);
    }
}