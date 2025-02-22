import java.util.Scanner;

public class CaseAccenture{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = sc.nextLine();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            }
            else{
                System.out.println();
                System.out.print(Character.toLowerCase(ch));
            }
        }
        sc.close();
    }
}