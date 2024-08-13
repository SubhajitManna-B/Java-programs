import java.util.Scanner;

public class PrefixSumOfRange {
    static void prefixSum(int arr[], int n){
        for(int i = 1; i <= n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
    }

    static int prefixSumOfRange(int arr[], int l, int r){
        int sum = 0;
        sum = arr[r] - arr[l-1]; 
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter "+n+" elements : ");
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the range : ");
        System.out.print("L : ");
        int l = sc.nextInt();
        System.out.print("R : ");
        int r = sc.nextInt();
        prefixSum(arr, n);
        System.out.println("The prefix sum is : "+prefixSumOfRange(arr, l, r));
    }
}
