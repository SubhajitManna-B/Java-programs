import java.util.Scanner;

public class PrintFirstNMultiples {

    static void printNMultiples(int n, int m){
        if(m == 1){
            System.out.print(n+" ");
            return;
        }
        printNMultiples(n, m-1);
        System.out.print(n*m + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of multiples : ");
        int no_of_mul = sc.nextInt(); 
        printNMultiples(n, no_of_mul);
    }
}
