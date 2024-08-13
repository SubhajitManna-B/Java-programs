import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number : ");
        int d_no = sc.nextInt();
        int ans = 0, pw = 1;
        while(d_no > 0){
            int bin_unit = d_no % 2;
            ans += (bin_unit * pw);
            pw *= 10;
            d_no /= 2;
        }
        System.out.println("The binary number is : "+ans);
    }
}
