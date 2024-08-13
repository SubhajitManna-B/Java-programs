import java.util.Scanner;
import java.io.*;

public class Test {
    public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter a even digit number : ");
       long l=200;
       int num=(int)l;
       num=obj.nextInt();
       int c=0;
       int sum=0;
       while(num>=1)
       {
          int r=num%10;
           sum=(sum*10)+r;
           num=num/10;
           c=c+1;
       }
       int dc=c/2;
       int count=0;
       while(sum>=1)
       {
        int rad=sum%10;
        sum=sum/10;
        count=count+1;
        System.out.print(rad+" ");
        if(count==dc)
        {
        System.out.println(" ");
        }
       }
    }   
}        
