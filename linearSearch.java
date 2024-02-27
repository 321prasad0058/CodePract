import java.util.*;

public class linearSearch
{
    public static int linearSearch(String n[], String key)
    {
        for(int i =0; i<n.length ; i++)
        {
            if(n[i]==key)
                return i;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        String n[] ={" Single Ragda ", " Bhel ",  " Sandwich ", " Aaloo Chat  "};
        String key = " Bhel ";

        int index = linearSearch(n,key);

        if(index==-1)
            System.out.println("Not Found");
        else
            System.out.println("Index : " + index);    

    }
}