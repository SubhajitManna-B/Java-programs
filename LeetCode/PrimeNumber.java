import java.lang.Math;
import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or not : ");
        int n = sc.nextInt();
        if(checkPrime(n)) System.out.printf("The number %d is Prime.",n);
        else System.out.printf("The number %d is not Prime.",n);
        sc.close();
    }
}
