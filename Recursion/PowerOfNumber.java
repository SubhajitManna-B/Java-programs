import java.util.Scanner;

public class PowerOfNumber {

    static int powerOfANumber(int p, int q){
        if (q == 0) {
            return 1;
        }
        return powerOfANumber(p, q-1) * p;
    }

    //Another process
    static int powerOfNumber(int p, int q){
        if (q == 0) {
            return 1;
        }
        int smallPow = powerOfANumber(p, q/2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        else{
            return smallPow * smallPow * p;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.print("P for Number : ");
        int p = sc.nextInt();
        System.out.print("Q for power : ");
        int q = sc.nextInt();
        System.out.println(p+ "^" +q+ " is : " +powerOfANumber(p, q));
        System.out.println(p+ "^" +q+ " is : " +powerOfNumber(p, q));
    }
}
