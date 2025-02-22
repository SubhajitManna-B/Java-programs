import java.util.Scanner;
import java.lang.Math;

public class DifferenceOfEvenAndOddSQRT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point of range : ");
        int m = sc.nextInt();
        System.out.print("Enter the ending point of range : ");
        int n = sc.nextInt();
        double sum1 = 0, sum2 = 2;
        for(int i = m; i<= n; i++){
            if(i % 2 == 0) sum1 += Math.sqrt(i);
            else sum2 += Math.sqrt(i);
        }
        System.out.printf("Diff = %.5f", (sum1-sum2));
    }
}