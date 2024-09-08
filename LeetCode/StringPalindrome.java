import java.lang.StringBuilder;

public class StringPalindrome {

    public static boolean checkPalindrome(String str){
        StringBuilder str1 = new StringBuilder(str);
        //String s1 = str1+"";
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        //String s2 = str2+"";
        return str1.equals(str2);
    }

    public static boolean checkPalindromeUsingTwoPointer(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new String("cuttuc");
        //System.out.println("Result = "+checkPalindrome(str));
        System.out.println("Result = "+checkPalindromeUsingTwoPointer(str));
    }

}
