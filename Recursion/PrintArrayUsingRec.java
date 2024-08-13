public class PrintArrayUsingRec {

    static void printArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,7,4,3,7,2,8,5,7,4};
        int idx = 0;
        printArray(arr,idx);
    }
}
