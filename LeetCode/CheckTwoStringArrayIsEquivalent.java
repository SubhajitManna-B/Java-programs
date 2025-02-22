public class CheckTwoStringArrayIsEquivalent {

    public static boolean isEquivalentString(String[] str1, String[] str2){
        StringBuilder stb1 = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();
        for (String st : str1) {
            stb1.append(st);
        }
        for (String st : str2) {
            stb2.append(st);
        }
        return stb1.toString().equals(stb2.toString());
    }

    public static void main(String[] args) {
        String str1[] = {"ab","c","de"};
        String str2[] = {"a","bc","d","e"};
        System.out.println("The strings are equivalent : "+isEquivalentString(str1, str2));
    }
}
