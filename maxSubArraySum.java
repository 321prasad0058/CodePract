import java.util.*;

public class maxSubArraySum
{
    public static void maxSubArraySum(int n[])
    {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<n.length ; i++)
        {
            int start = 0;

            for(int j=i; j<n.length; j++)
            {
                int end= j;

                for(int k=start; k<=end;k++)
                {
                    currSum += n[k];
                   
                }
                System.out.println(currSum);
                if(maxSum<currSum)
                    maxSum=currSum;
            }
            System.out.println();
        }
        System.out.println("The Maximum Sum is : " + maxSum);
    }

    public static void main(String[] args)
    {
        int n[] = {2,4,6,8,10,12};

        maxSubArraySum(n);

    }
}