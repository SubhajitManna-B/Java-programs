import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {

    public static void linkListQueue(){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println("First list :"+q1);
    }

    public static void arrayDeque(){
        Queue<Integer> q2 =  new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        System.out.println("Second list :"+q2);
    }

    public static void main(String[] args) {
        linkListQueue();
        arrayDeque();
    }
}
