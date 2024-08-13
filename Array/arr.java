import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arr {
    static ArrayList<Integer> subArray(int arr[], int n, int s){
        ArrayList<Integer> elements = new ArrayList<>();
        int i=0, j=0, sum=0;
        while(j < n){
            sum += arr[j];
            while(sum > s && i < j){
                sum -= arr[i];
                i++;
            }
            if(sum == s){
                elements.add(i+1);
                elements.add(j+1);
                return elements;
            }
            j++;
        }
        elements.add(-1);
        return elements;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum : ");
        int s = sc.nextInt();
        ArrayList<Integer>result = subArray(arr, n, s);
        for (int i : result) {
            System.out.print(i+" ");
        }
     }
}
