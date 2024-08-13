import java.util.Arrays;
import java.util.Scanner;

class Maximum_Minimum{

    static int findMaximum(int arr[], int n){
        int max = Integer.MIN_VALUE; 
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findMinimum(int arr[], int n){
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    //function for find the second maximum value
    static int findSecondMaximum(int arr[], int n, int maximum){
        int arr3[] = Arrays.copyOf(arr, n);
        int second_maximum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr3[i] == maximum){
                arr3[i] = Integer.MIN_VALUE;
            }
        }
        for(int i = 0; i<n; i++){
            if(arr3[i] > second_maximum){
                second_maximum = arr3[i];
            }
        }
        return second_maximum;
    }
    static int findSecondMinimum(int arr[], int n, int minimum){ 
        int arr2[] = Arrays.copyOf(arr, n);
        int second_minimum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr2[i] == minimum){
                arr2[i] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i<n; i++){
            if(arr2[i] < second_minimum){
                second_minimum = arr2[i];
            }
        }
        return second_minimum;
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
        int maximum = findMaximum(arr, n);
        int minimum = findMinimum(arr, n);
        int second_maximum = findSecondMaximum(arr, n, maximum);
        int second_minimum = findSecondMinimum(arr ,n, minimum);
        System.out.println("The maximum element is : "+maximum);
        System.out.println("The minimum element is : "+minimum);
        System.out.println("The second maximum element is : "+second_maximum);
        System.out.println("The second minimum element is : "+second_minimum);
    }
}