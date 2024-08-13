import java.util.Scanner;

public class SumOfArrayElementRec {

    static int sumOfArrary(int [] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        return (arr[idx] + sumOfArrary(arr, idx+1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenhgth of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the data in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println("The sum of all the array elements is : " +sumOfArrary(arr, idx));
    }
}
