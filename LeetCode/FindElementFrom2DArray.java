public class FindElementFrom2DArray {

    public static boolean isPresentElement(int arr[][], int target){
        int r = arr.length;
        int c = arr[0].length;
        int low = 0;
        int high = (r*c)-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid / c][mid % c] == target) return true;
            else if (arr[mid/c][mid%c] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}};
        int n = 3;
        System.out.println("The number "+n+" is present in the array : "+isPresentElement(arr,n));
    }
}
