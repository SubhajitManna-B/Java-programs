import java.util.Scanner;
import java.io.*;
class Math
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter a number : ");
     double n=obj.nextDouble();
     double s=(Math.pow(n,n));
     String sum=(Math.sqrt(n));
     System.out.println(n+" * "+n+ " = "+s);
     System.out.println("Sruere root of "+n+" is : "+sum);
    }

    public static String sqrt(double d1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sqrt'");
    }

    public static String floor(double d1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'floor'");
    }

    public static String ceil(double d1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ceil'");
    }

    public static double pow(double d1, double d2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pow'");
    }
}