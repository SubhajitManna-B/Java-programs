import java.lang.Math;
public class FindHiddenCodeUsingRecursion {

    public static int findSubString(int i, int j, String st1, String st2, int maxLen, int idx, int count){
        if(i == st1.length() || j == st2.length()){
            return count;
        }
        if(st1.charAt(i) == st2.charAt(j)){
            count = findSubString(i+1, j+1, st1, st2, maxLen, idx, count+1);
            if(count > maxLen){
                maxLen = count;
                idx = i-maxLen+1;
            }
        }
        int count2 = findSubString(i+1, j, st1, st2, maxLen, idx, 0);
        int count3 = findSubString(i, j+1, st1, st2, maxLen, idx, 0);
        return Math.max(count,Math.max(count2,count3));
    }

    public static void main(String[] args) {
        String str1 = new String("future");
        String str2 = new String("adventure");
        int len = findSubString(0, 0, str1, str2, 0, 0, 0);
        System.out.println(len);
    }
}
