public class InsertionSort {

    private void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,7,9,2,34,56,23,76,33,22};
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        System.out.println("After sorting in ascending order : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
