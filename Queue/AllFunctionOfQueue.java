import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class AllFunctionOfQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        while (true) {
            System.out.println("\nChoose 1 for add element.\nChoose 2 for show top element.\nChoose 3 for show all element.\nChoose 4 for delete element.\nChoose 5 for exit from the loop.");
            System.out.print("\nChoose one option :");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter the element you want to add : ");
                    int ele = sc.nextInt();
                    q.add(ele); 
                    break;

                case 2:
                    System.out.println("Top element is : " +q.peek());
                    System.out.println("Top element is : " +q.element());
                    break;

                case 3:
                    System.out.println("Queue list is : " +q);
                    break;

                case 4:
                    //System.out.println("Delete element is :" +q.remove()); //you can use remove() or poll()
                    System.out.println("Delete element is :" +q.poll());
                    break;

                case 5:
                    System.exit(0);
            
                default:
                    System.out.println("Enter a valid option.");
                    break;
            }   
        }
    }
}
