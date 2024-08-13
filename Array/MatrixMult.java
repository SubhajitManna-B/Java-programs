import java.util.Scanner;

public class MatrixMult {
    
    //Function for matrix multiplication
    static void matrixMult(int arr1[][], int arr2[][], int r1, int r2, int c1, int c2){
        if( c1 != r2){
            System.out.println("The multiplication is not possible.\n Please enter valid row and column ");
            return;
        }
        int mult[][] = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j =0 ; j<c2; j++){
                int sum = 0;
                for(int k=0 ; k<c1 ; k++){
                    sum += arr1[i][k]*arr2[k][j];
                }
                mult[i][j] = sum;
            }
        }
        
        //print the multiplication of the array
        System.out.println("The multiplication of two array is : ");
        for(int i=0; i < mult.length; i++){
            for(int j =0 ; j < mult[i].length; j++){
                System.out.print(mult[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
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
        
        //First matrix
        System.out.println("Enter the row and column of first matrix : ");
        System.out.print("R : ");
        int r1 = sc.nextInt();
        System.out.print("C : ");
        int c1 = sc.nextInt();        
        int arr1[][] = new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements of first matrix : ");
        for(int i=0; i<r1; i++){
            for(int j =0 ; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        // Second matrix
        System.out.println("Enter the row and column of second matrix : ");
        System.out.print("R : ");
        int r2 = sc.nextInt();
        System.out.print("C : ");
        int c2 = sc.nextInt();        
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter "+r1*c1+" elements of first matrix : ");
        for(int i=0; i<r2; i++){
            for(int j =0 ; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(" The first matrix is -----------");
        print2dArray(arr1);
        System.out.println(" The second matrix is -----------");
        print2dArray(arr2);
        matrixMult(arr1, arr2, r1, r2, c1, c2);
    }
}
