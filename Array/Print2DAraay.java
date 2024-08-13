import java.util.Scanner;

public class Print2DAraay {

    //Function for printing the matrix
    static void print2dArray(int arr[][]){
        System.out.println("The array is : ");
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
        print2dArray(arr);
    }
}
