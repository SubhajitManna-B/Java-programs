import java.util.Scanner;

public class TransposeOfMatrix {

    //Function of Transpose of a matrix
    static int[][] transposeMatrix(int arr[][], int r_c){
        for(int i=0 ; i<r_c ; i++){
            for(int j=i ; j<r_c ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr; 
    }

    //print matrix
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
        System.out.println("Enter the row and column(Row and coulum must be same in number) : ");
        int r_c = sc.nextInt();      
        int arr[][] = new int[r_c][r_c];
        System.out.println("Enter "+r_c*r_c+" elements : ");
        for(int i=0; i<r_c; i++){
            for(int j =0 ; j<r_c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] ans = transposeMatrix(arr, r_c);
        print2dArray(ans);

    }
}
