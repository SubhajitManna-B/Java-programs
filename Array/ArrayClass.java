import java.util.Arrays;

public class ArrayClass {
    static String functionOnArrrayClass(int arr[]){
        System.out.println("Copy arr2 from arr1");
        int arr2[] = Arrays.copyOf(arr,arr.length);
        printArray(arr2);
        System.out.println("Copy arr3 from arr2");
        int arr3[] = Arrays.copyOfRange(arr2, 0, 3);
        printArray(arr3);
        System.out.println("After sorting the array.");
        Arrays.sort(arr2);
        printArray(arr2);
        System.out.println("Print the clone of arr3 as arr4");
        int arr4[] = arr3.clone();
        printArray(arr4);
        System.out.println("Convert arr3 from array to string");
        String str = Arrays.toString(arr3);
        return str;
    }

    static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,4,5,3,6,8,89,9,3};
        System.out.println("Original Array");
        printArray(arr);
        System.out.println(functionOnArrrayClass(arr));
    }
}
