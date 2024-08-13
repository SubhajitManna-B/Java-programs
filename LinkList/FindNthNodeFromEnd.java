//Find the nth node from the end of list


public class FindNthNodeFromEnd {

    //Create Node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    //Find node from end
    public static Node findNode(Node head, int idx){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //Find node from end using for loop and size
    public static Node findNthNode(Node head, int idx){
        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        for(int i = 1; i < ((size-idx)+1); i++){
            temp = temp.next;
        }
        return temp;
    }

    //Print the list
    public static void display(Node head){
        System.out.println("The list is : ");
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
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
        int idx = 5;

        display(a);

        System.out.println();
        Node res = findNode(a, idx);
        System.out.println(idx+" node's data is : "+res.data);

        Node ans = findNthNode(a, idx);
        System.out.println(idx+" node's data is : "+ans.data);
    }
}
