import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        System.out.println("Enter priniciple: ");
        float p = sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("Enter the time: ");
        float t = sc.nextFloat();

        float interest = (p*r*t)/100;

        System.out.println("Priniciple : "+p);
        System.out.println("Rate : "+r);
        System.out.println("Time : "+t);
        System.out.println("Simple interest : "+interest);
    }    
}