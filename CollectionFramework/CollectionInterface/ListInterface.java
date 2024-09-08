import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListInterface {

    public static void arrayListExample(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);  //add elements
        arr.add(2);
        arr.add(3);   //[1,2,3]
        System.out.println(arr);  //print the list
        System.out.println(arr.get(0));   //access the data of index 0
        System.out.println(arr.contains(3));  //check element 3 is present in array or not!
        arr.set(1, 5);   //change the value of the index 1 
        System.out.println(arr);  //print the list
        System.out.println();
    }

    public static void linkedListExample(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);  //print the list
        System.out.println(ll.get(0));   //access the data of index 0
        System.out.println(ll.peek());
        System.out.println(ll.pop());
        System.out.println(ll.contains(3));  //check element 3 is present in array or not!
        ll.set(1, 5);   //change the value of the index 1 
        System.out.println(ll);  //print the list
        System.out.println();
    }

    public static void stackExample(){
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
        System.out.println(st.equals(st));
        System.out.println(st.size());
        System.out.println(st);
    }
    public static void main(String[] args) {
        arrayListExample();
        linkedListExample();
        stackExample();
    }
}
