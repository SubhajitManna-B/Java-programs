
public class PrintLinkListUsingRec {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void printLL(Node head){
        Node temp = head;
        if (temp == null) return;
        System.out.print(temp.data+" ");
        printLL(temp.next);
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(9);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        printLL(a);
    }
}
