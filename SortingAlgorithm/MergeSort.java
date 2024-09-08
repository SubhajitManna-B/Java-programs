public class MergeSort {

    static void displayArray(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void merge(int arr[], int l,int m, int r){
        int len1 = (m-l)+1;
        int len2 = r-m;
        //Create two array left[] and right[]
        int left[] = new int[len1];
        int right[] =  new int[len2];

        //Initialize the value to left and right
        for (int i = 0; i < len1; i++) left[i] = arr[l+i];
        for (int j = 0; j < len2; j++) right[j] = arr[m+j+1];

        //merege two array
        int i = 0, j = 0, k = l;
        while (i < len1 && j < len2) {
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else arr[k++] = right[j++];
        }
        while(i < len1){
            arr[k++] = left[i++];
        }
        while(j < len2){
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int arr[], int l, int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int arr[] = {1,7,4,6,3,6,9,46,3,65,43,62};
        int len = arr.length;
        System.out.println("Array before sorting : ");
        displayArray(arr);
        mergeSort(arr, 0, len-1);
        System.out.println("Array after sorting : ");
        displayArray(arr);
    }
}
