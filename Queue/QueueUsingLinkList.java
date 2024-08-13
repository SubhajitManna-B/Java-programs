public class QueueUsingLinkList {

    //create user define data type
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    //create user define class 
    public static class QueueB {
        Node rear = null;
        Node front = null;
        int size = 0;
        public void addElement(int data){
            Node temp = new Node(data);
            if(size == 0){
                front = rear = temp;
                size++;
                return;
            }
            rear.next = temp;
            rear = rear.next;
            size++;
        }

        public int removeElement(){
            if(front == null){
                System.out.println("The queue is empty.");
                return -1;
            }
            int dta = front.val;
            front = front.next;
            size--;
            return dta;
        }

        public int topElement(){
            if(size == 0){
                System.out.println("The queue is empty.");
                return -1;
            }
            return front.val;
        }

        public void displayElements(){
            if(size == 0){
                System.out.println("The queue is empty.");
                return;
            }
            Node tmp = front;
            System.out.print("The elements are : ");
            while(tmp != null){
                System.out.print(tmp.val+" ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueB q = new QueueB();
        q.addElement(7);
        q.addElement(12);
        q.addElement(5);
        q.addElement(9);
        q.displayElements();
        System.out.println("Top elemeent = "+q.topElement());
        System.out.println("size = "+q.size);
        System.out.println("Delete element = "+q.removeElement());
        System.out.println("Top element = "+q.topElement());
        System.out.println("size = "+q.size);
        q.addElement(8);
        q.addElement(2);
        q.displayElements();
        System.out.println("Top elemeent = "+q.topElement());
        System.out.println("size = "+q.size);
    }
}