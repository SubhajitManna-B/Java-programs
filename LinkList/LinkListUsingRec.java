import java.util.Scanner;

public class LinkListUsingRec {

    //Create Node
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    //Create link list class
    public static class LinkList {
        Node head = null;
        Node tail = null;
        int size = 0;
        Scanner sc = new Scanner(System.in);

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

        //Create Link List recursively
        void createLinkList(int size){
            if(size == 0) {
                return;
            }
            System.out.println("Enter data : ");
            int element = sc.nextInt();
            insertAtEnd(element);
            createLinkList(size-1);
        }

        void display(){
            System.out.println("The list is : ");
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

   
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        LinkList ll = new LinkList();
        System.out.println("Enter how many elements you want to put : ");
        int numOfEle = sc.nextInt();
        ll.createLinkList(numOfEle);
        ll.display();
    }
}
