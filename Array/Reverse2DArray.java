import java.util.Scanner;

public class Reverse2DArray {

    static void reverse2dArray(int arr[][], int r , int c){
        for(int i=0; i<r; i++){
            int dup_c = c-1;
            for(int j =0 ; j<c/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][dup_c];
                arr[i][dup_c] = temp;
                dup_c--;
            }
        }
    }

    //Function for printing the matrix
    static void print2dArray(int arr[][]){
        for(int i=0; i < arr.length; i++){
            for(int j =0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column : ");
        System.out.print("R : ");
        int r = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();        
        int arr[][] = new int[r][c];
        System.out.println("Enter "+r*c+" elements : ");
        for(int i=0; i<r; i++){
            for(int j =0 ; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before reverse the original matrix is : ");
        print2dArray(arr);
        reverse2dArray(arr, r, c);
        System.out.println("After reversing the matrix is : ");
        print2dArray(arr);
    }
}