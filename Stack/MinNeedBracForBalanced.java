import java.util.Scanner;
import java.util.Stack;

public class MinNeedBracForBalanced {

    public static int minimumBracketNeed(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.size() == 0 && ch == ')') {
                st.push(ch);
            }
            else if (ch == '(') st.push(ch);
            else {
                if (st.peek() == '(') st.pop();
                else st.push(ch);
            }
        }
        return st.size();
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string of brackets : ");
        String brac = sc.nextLine();
        System.out.println("The no. of brackets needed to make balanced are : "+minimumBracketNeed(brac));
    }
}
