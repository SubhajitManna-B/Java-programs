import java.util.Scanner;

public class SubSequencesOfString {

    static void subSequences(String str, String currAns){
        if(str.length() == 0){
            System.out.println(currAns);
            return;
        }
        char currChr = str.charAt(0);
        String remString = str.substring(1);
        subSequences(remString, currAns + currChr);
        subSequences(remString, currAns);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        subSequences(s, "");
    }
}
