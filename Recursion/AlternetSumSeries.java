import java.util.Scanner;

public class AlternetSumSeries {

    static int alternretSum(int n){
        if (n == 0) {
            return 0;
        }
        if (n % 2 != 0) {
            return alternretSum(n-1) + n;
        }
        return alternretSum(n-1) - n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of the series : ");
        int n = sc.nextInt();
        System.out.println("The result is : "+alternretSum(n));
    }
}
