import java.util.*;

class searchIn2DMatrix {
    public static void main(String[] args) {
        int arr[][] ={
            {23,45,12},
            {12,34,98,2},
            {97,11,3},
            {9,89,65,72}
        };

        int target = 65;

        int[] ans = searchIn2DMatrix(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2DMatrix(int[][] arr, int target) 
    {
        for (int row = 0; row < arr.length; row++) 
        {
            for (int col = 0; col < arr[row].length; col++) 
            {
                if (arr[row][col] == target)
                    return new int[]{row, col};
            }
        }
        // If the target is not found in the matrix, return a dummy value
        return new int[]{-1, -1};
    }
}
