import java.util.Scanner;

public class Fibonacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number of fibonacy series you want : ");
        int num = sc.nextInt();
        int count = 0,a=0,b=1;
        System.out.println("The fibonacy series is : ");
        while(count<num){
            System.out.println(a);
            int s=a+b;
            a=b;
            b=s;
            count+=1;
        }
    }
}
