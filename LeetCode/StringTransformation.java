public class StringTransformation{

    public static String transformString(String str){
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') ch[i] = 'b';
            else if(ch[i] == 'b') ch[i] = 'a';
        }
        return new String(ch);

        // str = new String(ch);
        // return str;
    }

    public static void main(String[] args) {
        String str = "abcdbbeaafgh";
        System.out.println("Before transformation : "+str);
        System.out.println("After transformation : "+transformString(str));
    }
}