import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterface {

    public static void linkedListQueueExample(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(11);
        ll.offer(12);
        ll.add(13);
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll.size());
        System.out.println(ll.peek());
        System.out.println();
    }

    public static void priorityQueue(){
        //we can also write new PriorityQueue<>(Comparator.naturalOrder()) for min priority queue 
        PriorityQueue<Integer> minpq = new PriorityQueue<>();  //by default priority queue is a min priority queue 
        minpq.add(15);
        minpq.add(2);
        minpq.add(9);
        minpq.add(13);
        minpq.add(23);
        System.out.println(minpq.peek());
        System.out.println(minpq);
        System.out.println(minpq.poll());
        System.out.println(minpq.peek());
        System.out.println(minpq);
        System.out.println();

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        maxPQ.add(23);
        maxPQ.add(34);
        maxPQ.add(12);
        maxPQ.add(25);
        maxPQ.add(8);
        System.out.println(maxPQ);
        System.out.println(maxPQ.peek());
        System.out.println(maxPQ.poll());
        System.out.println(maxPQ);
        System.out.println();
    }

    public static void dequeueExample(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addLast(4);
        dq.addFirst(5);
        dq.addLast(6);
        System.out.println(dq);
        dq.add(7);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.poll());
    }

    public static void main(String[] args) {
        linkedListQueueExample();
        priorityQueue();
        dequeueExample();
    }
}
