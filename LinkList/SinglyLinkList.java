
public class SinglyLinkList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        
        //Insert data at the end of the list
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        //Insert data at the Starting of the list
        void insertAtFirst(int val){
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }   
            size++;
        }

        //Insert data at the given index of the list
        void insertAtGivenPost(int val, int pos){
            Node temp = new Node(val);
            Node trav = head;
            if (pos == 0) {
                insertAtFirst(val);
                return;
            }
            if (pos == size) {
                insertAtEnd(val);
                return;
            }
            for (int i = 0; i < pos-1; i++) {
                trav = trav.next;
            }
            temp.next = trav.next;
            trav.next = temp;
            size++;
        }

        //Search element from any index
        int getElement(int idx){
            Node temp = head;
            if (idx < 0 || idx > size) 
                {
                    System.out.println("You are searching in Wrong index.");
                    return -1;
                }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        //Delete data from any index
        void deleteElement(int idx){
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        //Size of link list
        // int sizeOfLinkList(){
        //     Node temp = head;
        //     int count = 0;
        //     while (temp != null) {
        //         temp = temp.next;
        //         count++ ;
        //     }
        //     return count;
        // }

        //Display the list
        void display(){
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(9);
        ll.display();
        ll.insertAtFirst(12);
        ll.insertAtEnd(5);
        ll.insertAtFirst(2);
        System.out.println();
        ll.display();

        System.out.println();
        ll.insertAtGivenPost(13, 5);
        ll.display();

        System.out.println();
        System.out.println("Size of list : "+ll.size);

        System.out.println(ll.getElement(4));
        ll.deleteElement(4);
        ll.display(); 
    }
}