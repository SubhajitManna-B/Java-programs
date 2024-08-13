public class MoveAllZeroToEnd {

    public void moveZeroToEnd(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0,0,5,0,0,0};
        System.out.println("Before moving zero : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        MoveAllZeroToEnd obj = new MoveAllZeroToEnd();
        obj.moveZeroToEnd(arr);
        System.out.println("After moving zero : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}