import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class MathClass
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter a number : ");
     int n=obj.nextInt();
     double s = Math.pow(n,2);
     double sum = Math.sqrt(n);
     System.out.println(n+" * "+n+" = "+s);
     System.out.println("Sruere root of "+n+" is : "+sum);
    }
}