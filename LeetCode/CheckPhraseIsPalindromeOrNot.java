public class CheckPhraseIsPalindromeOrNot {

    // public static boolean isPalindrome(String s) {
    //     if (s.isEmpty()) return true;
    //     s = s.replaceAll("[^a-zA-Z0-9]"," ");
    //     s = s.toLowerCase().replaceAll("\\s","");
    //     String str = "";
    //     for(int i=0; i<s.length(); i++){
    //         str = s.charAt(i) + str;
    //     }
    //     if (s.equals(str)) return true;
    //     else return false;
    // }

    //Better method , time complexity O(n) and space complexity O(1)
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true; 
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
           
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}