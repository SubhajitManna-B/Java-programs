import java.util.Scanner;

class Sum
{
    int a,b;
    int sum()
    {
        int sol=a+b;
        System.out.println("The sum of a and b is : "+sol);
        return sol;
    }
}
class Average extends Sum
{  
    int total;
    void average()
    {
        
    float avg =total/2;
    System.out.println("The average is : "+avg);
    }
}

class Extends
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int x=obj.nextInt();
        int y=obj.nextInt();
        Sum obj1=new Sum();
        obj1.a=x;
        obj1.b=y;
       // obj1.sum();
        Average obj2=new Average();
        int temp=obj1.sum();
        obj2.total=temp;
        obj2.average();
    }
}
