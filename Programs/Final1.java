//import java.util.Scanner;
//import java.io.*;
class a
{
    final int COUNT;
    a()
    {
       COUNT=100; 
    }
    void disp()
    {
        int count=COUNT+1;
        System.out.println("The value of count is : "+COUNT);
        System.out.println("The value of count is : "+count);
    }
}

public class Final1 {
     public static void main(String[] args) {
    a obj=new a();
    obj.disp();    
    }
}
