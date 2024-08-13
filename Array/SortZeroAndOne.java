import java.util.Scanner;

class SortZeroAndOne{

    // static void sortZeroAndOne(int arr[], int n){
    //     int count = 0;
    //     for(int i = 0; i < n; i++){
    //         if(arr[i] == 0){
    //             count++;
    //         }
    //     }
    //     for(int i = 0; i<count; i++){
    //         arr[i] = 0;
    //     }
    //     for(int i = count; i<n; i++){
    //         arr[i] = 1;
    //     }
        
    //     for(int i=0; i<n; i++){
    //         System.out.println(arr[i]+" ");
    //     }
    // }

    static void sortZeroAndOne(int arr[], int n){
        int left = 0, right =n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
              }
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortZeroAndOne(arr, n);
    }
}