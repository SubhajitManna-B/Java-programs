public class FindMiddleOfLinkList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkList{
        Node head = null;
        Node tail = null;
        void addDataInList(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = head;
            }
            else{
                tail.next = temp;
                tail = tail.next;
            }
        }

        int findMiddle(){
            Node fast = head;
            Node slow = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args) {
        //FindMiddleOfLinkList obj = new FindMiddleOfLinkList();
        //FindMiddleOfLinkList.Node a = obj.new Node(6); 
        LinkList ll = new LinkList();
        ll.addDataInList(1);
        ll.addDataInList(2);
        ll.addDataInList(3);
        ll.addDataInList(4);
        ll.addDataInList(5);
        ll.addDataInList(6);
        ll.addDataInList(7);
        ll.addDataInList(8);
        ll.addDataInList(9);
        ll.addDataInList(10);
        System.out.println("Middle = "+ll.findMiddle());
    }
}
