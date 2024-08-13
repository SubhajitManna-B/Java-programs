import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class ReverseArrayAsList {

    static void printArray(int []arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reverseArray(Integer arr[], int n){
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter " +n+ " elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,n);
        //printArray(arr, n);
    }
}
