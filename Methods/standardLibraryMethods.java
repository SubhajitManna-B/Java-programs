import java.util.Scanner;

public class standardLibraryMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1,d2;
        System.out.println("Enter two double numbers : ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        
        //sqrt() method
        System.out.println("Square root of "+d1+" is : "+Math.sqrt(d1));
        System.out.println("Square root of "+d2+" is : "+Math.sqrt(d2));

        //floor() method
        System.out.println("Floor of "+d1+" is : "+Math.floor(d1));
        System.out.println("Floor of "+d2+" is : "+Math.floor(d2));

        //ceil() method
        System.out.println("Ceil of "+d1+" is : "+Math.ceil(d1));
        System.out.println("Ceil of "+d2+" is : "+Math.ceil(d2));

        //pow() method
        System.out.println(d2+" power of "+d1+" is : "+Math.pow(d1,d2));
        System.out.println(d1+" power of "+d2+" is : "+Math.pow(d2,d1));
    }
}
