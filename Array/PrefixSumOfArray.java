import java.util.Scanner;

public class PrefixSumOfArray {

    static int[] prefixSum(int arr[], int n){
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void printArray(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        int[] pref = prefixSum(arr, n);
        printArray(pref);
    }
}
