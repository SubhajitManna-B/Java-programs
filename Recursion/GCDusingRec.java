import java.util.Scanner;

public class GCDusingRec {

    static int findGCD(int x, int y){
        if (y == 0) {
            return x;
        }
        return findGCD(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The GCD of " +x+ " and " +y+ " is : " +findGCD(x, y));
    }
}