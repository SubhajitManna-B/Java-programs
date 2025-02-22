public class FindHiddenCode {

    public static int checkSubString(String st1, String st2){
        int length = 0;
        int idx = 0;
        while(idx<st1.length() && idx<st2.length() && st1.charAt(idx) == st2.charAt(idx)){
            length++;
            idx++;
        }
        return length;
    }
    public static void main(String[] args) {
        String str1 = new String("welcome");
        String str2 = new String("comeon");
        int length = 0;
        int strtIdx = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    int len = checkSubString(str1.substring(i), str2.substring(j));
                    if(len > length){
                        length = len;
                        strtIdx = j;
                    }
                }
            }
        }
        String ansSubStr = str2.substring(strtIdx,strtIdx+length);
        int ans = 0;
        for (int i=0; i<ansSubStr.length(); i++) {
            ans += (int)ansSubStr.charAt(i);
        }
        System.out.println("Answer = "+ans);
    }
}
