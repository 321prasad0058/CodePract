import java.util.*;

class evenNosInArray
{
    public static void main(String[] args)
    {
        int[] arr = {23,46,12, 1877, 1986, 1, 20,24};

        System.out.println(evenNosInArray(arr));

    }

    static int evenNosInArray(int arr[])
    {
        int cnt =0; 

        for(int i =0; i< arr.length; i++)
        {
            if(String.valueOf(arr[i]).length() %2==0)
                cnt++;
        }
        return cnt;
    }
}