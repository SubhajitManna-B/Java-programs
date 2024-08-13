import java.util.Scanner;
import java.io.*;

abstract class sum{
    abstract void sum(int x,int y);
}
class answer extends sum{
    int a,b;
    void sum(int x,int y)
    {
        System.out.println("The first number is : "+x);
        System.out.println("The second number is : "+y);
        a=x;
        b=y;
    }
    void getdata()
    {
        int s;
        s=a+b;
        System.out.println("The sum of a and b is : "+s);
    }
}

class Abstract{
      public static void main(String[] args) {
      Scanner obj = new Scanner (System.in);
      int n1,n2;
      System.out.print("Enter the first number is : ");
      n1=obj.nextInt();
      System.out.print("Enter the second number is : ");
      n2=obj.nextInt();
      answer obj1=new answer();
      obj1.sum(n1,n2);
      obj1.getdata();  
    }
}