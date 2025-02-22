import java.lang.StringBuilder;

public class ReverseStringInOrderOfWord {

    public static void main(String[] args) {
        String str = new String("Subhajit is a good boy.");
        String[] st = str.split("\\s");
        String str2 =  new String();
        for (String string : st) {
            StringBuilder sb = new StringBuilder(string);
            str2 = str2 + sb.reverse() +" ";
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
