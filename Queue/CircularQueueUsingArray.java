public class CircularQueueUsingArray {

    //Create a public calss for all the function
    public static class CircularQueue{
        int front = -1;
        int rear = -1;
        int arr[] = new int[20];
        int size = 0;

        // Create Push() function
        public void push(int val) throws Exception{
            if (size == 0) {
                front = rear = 0;
                arr[rear] = val;
            }
            else if (size == arr.length-1) {
                throw new Exception("Queue is Full!");
            }
            else if (rear == arr.length-1) {
                rear = 0;
                arr[rear] = val;
            }
            else{
                arr[++rear] = val;
            }
            size++;
        }

        //Create Pop() function
        public int pop() throws Exception{
            int del_item = arr[front];
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }
            else if (front == arr.length-1) {
                front = 0;
            }
            else{
                front = front+1;
            }
            size--;
            return del_item;
        }

        //Create Peek() function
        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }
            return arr[front];
        }

        //Create diplayElements() function to print all the elements.
        public void displayElements() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }
            else if (front > rear) {
                for (int i = rear; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = front; i < rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        try {
            q.push(1);
            q.push(2);
            q.push(3);
            q.push(4);
            q.displayElements();
            System.out.println("size = " +q.size);
            System.out.println("top = " +q.peek());
            System.out.println("delete = " +q.pop());
            q.push(5);
            q.push(6);
            q.displayElements();
            System.out.println("size = " +q.size);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}