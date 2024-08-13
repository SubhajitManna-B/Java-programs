import java.util.*;

public class FactorialRec {

    static int factRec(int n){
        if(n == 0){
            return 1;
        }
        return n * factRec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to print : ");
        int n = sc.nextInt();
        System.out.println("The factorial of " +n+ " is : " +factRec(n));
    }
}
