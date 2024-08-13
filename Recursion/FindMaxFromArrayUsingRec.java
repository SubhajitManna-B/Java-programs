import java.util.Scanner;
import java.lang.Math;

public class FindMaxFromArrayUsingRec {

    static int findMax(int arr[], int idx){
        if (idx == arr.length-1) {
            return arr[idx];
        }
        return Math.max(findMax(arr, idx+1),arr[idx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenhgth of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("Maximum = "+findMax(arr, idx));
    }
}
