import java.util.*;

public class FibonaciRecursion {

    private static int fibonaciSereise(int n) {
        if(n == 0 || n==1){
            return n;
        }
        return fibonaciSereise(n-1) + fibonaciSereise(n-2);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of term : ");
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            System.out.print(fibonaciSereise(i) + " ");
        }
    }
}