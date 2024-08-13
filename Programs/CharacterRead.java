import java.util.Scanner;

public class CharacterRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0); //Read a character from a string
        System.out.println("The character is : "+ch);
    }
}
