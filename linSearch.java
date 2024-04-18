import java.util.*;
class linSearch
{
    public static void main(String[] args)
    {
    int arr [] = {23,46,16,25,2,19,84};
    int key = 84;

    int index = linearSearch(arr,key);

    if(arr.length==0)
        System.out.println("Not Found");
    else
        System.out.println(key + " Found at Index: \n"+ index);      
    }


    public static int linearSearch(int[] arr, int key)
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]== key)
             return i;
        }
        return -1;
    }

}
