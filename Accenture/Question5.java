//package Accenture;

public class Question5 {
    public static void main(String[] args) {
        String str = new String("Move-Hypen-Sayandeep");
        System.out.println(str);
        String ans = new String();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '-') ans = str.charAt(i)+ans;
            else ans += str.charAt(i);
        }
        System.out.println(ans);
    }
}
