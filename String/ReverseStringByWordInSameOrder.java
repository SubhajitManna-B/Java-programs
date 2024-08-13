//package String;

public class ReverseStringByWordInSameOrder {

    public static String reverseWordInOrder(String str){
        String ansStr = new String();        
        String strArr[] = str.split("\\s");
        for (String string : strArr) {
            StringBuilder st = new StringBuilder(string);
            ansStr += st.reverse()+" ";
        }
        return ansStr.trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordInOrder("I am Subhajit manna"));
    }
}
