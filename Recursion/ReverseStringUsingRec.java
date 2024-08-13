import java.util.Scanner;

public class ReverseStringUsingRec {

    //reverse function
    static String reverseString(String str, int idx){
        if(idx == str.length()) return ""; 
        String smallAns = reverseString(str, idx+1);
        return smallAns + str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        System.out.print("Reverse string is : ");
        System.out.println(reverseString(s, 0));
    }
}
