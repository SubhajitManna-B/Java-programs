import java.util.Scanner;
import java.lang.Math;

public class MaxValOfArray {

    static int findMaxValue(int[] arr){
        int maximum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            maximum = Math.max(arr[i],maximum);
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenhgth of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum = " +findMaxValue(arr));
    }
}
