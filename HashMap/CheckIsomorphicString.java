import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CheckIsomorphicString {

    public boolean isIsomorphic(String str1, String str2) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();  // It takes more space complexity but less time complexity
        for (int i = 0; i < str1.length(); i++) {
            Character ch1 = str1.charAt(i);
            Character ch2 = str2.charAt(i);
            if (!hm.containsKey(ch1)) {
                if (hs.contains(ch2)) return false;  //We can also use the hm.containsValue() function
                hm.put(ch1, ch2);
                hs.add(ch2);
            } 
            else {
                if (hm.get(ch1) != ch2) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        System.out.println("Enter two string for checking : ");
        System.out.print("First string : ");
        str1 = sc.next();
        System.out.print("Second string : ");
        str2 = sc.next();
        CheckIsomorphicString obj = new CheckIsomorphicString();
        if (obj.isIsomorphic(str1,str2)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
