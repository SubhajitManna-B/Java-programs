import java.util.HashMap;

public class AnagramCheckOfTwoString {

    static boolean checkAnagram(String s1, String s2){
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> st1 = new HashMap<>();
        HashMap<Character, Integer> st2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(!st1.containsKey(ch)){
                st1.put(ch, 0);
            }
            else{
                st1.put(ch, st1.get(ch)+1);
            }
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(!st2.containsKey(ch)){
                st2.put(ch, 0);
            }
            else{
                st2.put(ch, st2.get(ch)+1);
            }
        }
        return st1.equals(st2);
    }
    public static void main(String[] args) {
        String str1 = "Subha";
        String str2 = "subha";
        System.out.println("Result = "+checkAnagram(str1, str2));
    }
}
