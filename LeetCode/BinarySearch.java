public class BinarySearch {

    public static int binarySearch(int arr[], int n){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == n) return mid;
            else if(n > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,12,14,18,21,22,28,32,33,45,46,50};
        int n = 42;
        System.out.println("Element "+n+" is present at index : "+binarySearch(arr, n));
    }
}
