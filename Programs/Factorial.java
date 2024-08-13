import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int no = sc.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++){
            fact=fact*i;
        }
        System.out.printf("The factorial of {no} is : {fact}");
        System.out.println("The factorial of "+no+" is : "+fact);
    }
}
