import java.util.*;

public class pairsInArray
{
    public static void pairsInArray(int n[])
    {
        int tp=0;
        for(int i=0; i<n.length; i++)
        {
            int current = n[i];
            
            for(int j =i+1; j<n.length; j++)
            {
                System.out.println("(" + current + " , " + n[j] +" ) ");
                tp++;
            }
            System.out.println();
        }

        System.out.println(" Total pair of array " + n + " are " + tp);
    }

    public static void main(String[] args)
    {
        int n[] = {2,4,6,8,10};
        pairsInArray(n);
    }

}
