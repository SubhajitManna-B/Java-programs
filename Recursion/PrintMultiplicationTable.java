import java.util.Scanner;

public class PrintMultiplicationTable{

    public static void mult(int n, int m){
        if(m == 1){
            System.out.println(n +" * "+m+" = "+n*m);
            return;
        }
        mult(n, m-1);
        System.out.println(n +" * "+m+" = "+n*m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        mult(num, 10);
    }
}