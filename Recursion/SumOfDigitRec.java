import java.util.Scanner;

public class SumOfDigitRec {

    static int sumOfDig(int n){
        if (n == 0) {
            return 0;
        }
        return sumOfDig(n/10) + (n%10);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum of all digit of number " +n+ " is : " +sumOfDig(n));
    }
}
