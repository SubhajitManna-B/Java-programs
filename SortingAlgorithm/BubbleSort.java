class BubbleSort{

    public void bSoring(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            boolean check = false;
            for (int j = 0; j < (arr.length-1)-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
            if (!check) {
                return;
            }
        }
    } 

    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3};
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        BubbleSort obj = new BubbleSort();
        obj.bSoring(arr);
        System.out.println("After sorting in ascending order : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}