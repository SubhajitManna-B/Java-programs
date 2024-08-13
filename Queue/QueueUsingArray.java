
public class QueueUsingArray {

    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[50];
        
        public void addElement(int val){
            if(r == arr.length-1) System.out.println("The queue is full.");
            if(f == -1){
                f = r = 0;
                arr[f] = val;
                size++;
                return;
            }
            arr[++r] = val;
            size++;
        }

        public int removeElement(){
            if(size == 0){
                System.out.println("The queue is empty.");
                return -1;
            }
            f = f+1;
            size--;
            return arr[f-1];
        }

        public int topElement(){
            if(size == 0){
                System.out.println("The queue is empty.");
                return -1;
            }
            return arr[f]; 
        }

        public void displayElements(){
            if(size == 0){
                System.out.println("The queue is empty.");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.addElement(1);
        q.addElement(2);
        q.addElement(3);
        q.addElement(4);
        System.out.println("Top element = "+q.topElement());
        q.displayElements();
        System.out.println("Size = "+q.size);
        System.out.println("Remove element = "+q.removeElement());
        q.displayElements();
        System.out.println("Top element = "+q.topElement());
        System.out.println("Size = "+q.size);
        q.addElement(5);
        q.displayElements();
    }
}
