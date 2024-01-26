import java.util.*;

public class getithBit
{

    public static int getithBit(int n, int i)
    {   int bitMask = 1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        else
        {
           return 1;
        }
    }

    public static void main(String args[])
    {
        System.out.println(getithBit(15,2));
        System.out.println(getithBit(6,3));
    }
}