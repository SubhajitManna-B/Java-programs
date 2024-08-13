import java.util.Scanner;

public class SpiralMatrix {

    static void spiralMatrix(int arr[][], int r, int c){
        int top_row = 0 , bottom_row = r-1 , left_column = 0 , right_column = c-1;
        int count_elements  = 0;
        System.out.println("---------- Print matrix in spiral order ----------");
        while(count_elements < r*c){
            
            //top row -> from left columnn to right column 
            for(int j = left_column; j <= right_column && count_elements < r*c; j++){
                System.out.print(arr[top_row][j]+" ");
                count_elements++;
            }
            top_row++;
   
            //rightColumn -> from topRow to bottomRow
             for(int i = top_row; i <= bottom_row && count_elements < r*c; i++){
                System.out.print(arr[i][right_column]+" ");
                count_elements++;
            }
            right_column--;

            //bottomRow -> from rightColumn to leftColumn
            for(int j = right_column; j >= left_column && count_elements < r*c; j--){
                System.out.print(arr[bottom_row][j]+" ");
                count_elements++;
            }
            bottom_row--;

            //rightColumn -> from topRow to bottomRow
            for(int i = bottom_row; i >= top_row && count_elements < r*c; i--){
                System.out.print(arr[i][left_column]+" ");
                count_elements++;
            }
            left_column++;
        }
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
        spiralMatrix(arr, r, c);
    }
}
