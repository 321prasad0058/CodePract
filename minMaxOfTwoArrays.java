import java.util.Scanner;

public class minMaxOfTwoArrays {
    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {

        int[] arr1 = new int[uniqueCnt1];
        int[] arr2 = new int[uniqueCnt2];

        for (int i = 0; i < uniqueCnt1; i++) {
            if (i % divisor1 != 0) {
                arr1[i] = i;
            }
             for (int j = 0; j < uniqueCnt2; j++) {
            if (j % divisor2 != 0 && j!=i) {
                arr2[j] = j;
            }
        }

        }
       

        int[] newArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);

        int large = 0;
        for (int k = 0; k < newArray.length; k++) {
            if (large < newArray[k]) {
                large = newArray[k];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the divisor1, divisor2, uniqueCnt1, and uniqueCn1 : ");
        int divisor1 = s.nextInt();
        int divisor2 = s.nextInt();
        int uniqueCnt1 = s.nextInt();
        int uniqueCnt2 = s.nextInt();

        System.out.println(minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2));
    }
}
