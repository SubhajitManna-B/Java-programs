import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagramOfTwoString {

    public static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            }
            else{
                mp.put(ch, mp.get(ch)+1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        else{
            HashMap<Character, Integer> st1 = makeFreqMap(str1);
            HashMap<Character, Integer> st2 = makeFreqMap(str2);
            return st1.equals(st2);
        }
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
        CheckAnagramOfTwoString obj = new CheckAnagramOfTwoString();
        if (obj.isAnagram(str1, str2)) {
            System.out.println("Strings are anagram.");
        }
        else{
            System.out.println("Strings are not anagram.");
        }
        sc.close();
    }
}
