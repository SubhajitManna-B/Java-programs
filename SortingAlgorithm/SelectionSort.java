public class SelectionSort {

    public void selecSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,1,9,7,4,5,12,67,34,67};
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        SelectionSort obj = new SelectionSort();
        obj.selecSort(arr);
        System.out.println("After sorting in ascending order : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
