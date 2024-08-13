import java.util.Scanner;
import java.io.*;
class rectArea
{
    static int a,b;
    static void area()
    {
        int s=a*b;
        System.out.println("The area of rectangle is : "+s);
    }
}
class cirArea extends rectArea
{
    static float r;
    static void area()
    {
        float s1=(22/7)*r*r;
        System.out.println("The area of circle is : "+s1);
    }  
}
class MethodOvrrid
{
  public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int x=obj.nextInt();
        int y=obj.nextInt();
        rectArea.a=x;
        rectArea.b=y;
        rectArea.area();
        System.out.print("Enter the value of radious : ");
        float p=obj.nextFloat();
        cirArea.r=p;
        cirArea.area();
    }
}