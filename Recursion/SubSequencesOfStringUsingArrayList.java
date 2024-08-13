import java.util.ArrayList;
import java.util.Scanner;

public class SubSequencesOfStringUsingArrayList {

    static ArrayList<String> subSequences(String str){
        ArrayList<String> ans = new ArrayList<>();
        if(str.length() == 0){
            ans.add("");
            return ans;
        } 
        char currChar = str.charAt(0);
        ArrayList<String> smallAns = subSequences(str.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(currChar + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        ArrayList<String> ans = subSequences(s);
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}
