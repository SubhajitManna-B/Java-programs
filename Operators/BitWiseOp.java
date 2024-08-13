import java.util.Scanner;

class BitWiseOp {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Two numbers are : x = "+x+" and y = "+y);

        System.out.println(x | y);  //bitwise OR
        System.out.println(x & y);  //bitwise AND
        System.out.println(x ^ y);  //bitwise XOR
        
        System.out.println(~x);  //complement x
        System.out.println(~y);  //complement y

        System.out.println(x << 1);  //left shift by 1
        System.out.println(x << 2);  //left shift by 2

        System.out.println(y >> 1);  //right shift by 1
        System.out.println(y >> 2);  //right shift by 2

    }
}