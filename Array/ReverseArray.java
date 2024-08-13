import java.util.Scanner;

public class ReverseArray {

    static void printArray(int []arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    //---------------LOGIC 1----------------------
    static void reverseArray(int arr[], int n){
        int j = n-1;
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }



    //---------------LOGIC 2----------------------
    // static void inArray(int arr[], int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // static void reverseArray(int arr[], int n){
    //     int i = 0, j = n-1;
    //     while(i < j){
    //         inArray(arr, i, j);
    //         i++;
    //         j--;
    //     }
    // }




    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr,n);
        reverseArray(arr, n);
        printArray(arr,n);
    }
}
