import java.util.Scanner;
import java.util.Stack;

class BalancedBracket{

    public static Boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }
            else{
                if (st.size() == 0) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if (st.size() > 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of brackets : ");
        String brac = sc.nextLine();
        System.out.println("The brackets are balanced : "+isBalanced(brac));
    }
}