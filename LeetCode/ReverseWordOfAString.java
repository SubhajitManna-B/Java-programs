public class ReverseWordOfAString {
    public static void main(String[] args) {
        String str = new String("Subhajit is a good boy.");
        String[] st = str.split("\\s");
        String str2 = new String();
        for(int i = st.length-1; i>=0; i--){
            str2 = str2 + st[i] + " ";
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
