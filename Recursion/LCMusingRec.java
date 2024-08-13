import java.util.*;

public class LCMusingRec {


    static int findLCM(int n, int m){
        int gcd = findGCD(n, m);
        return ((n*m)/gcd);
    }

    static int findGCD(int x, int y){
        if(y == 0){
            return x;
        }
        return findGCD(y, x%y);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("GCD of "+n+" and "+m+" is : "+findLCM(n, m));
    }
}
