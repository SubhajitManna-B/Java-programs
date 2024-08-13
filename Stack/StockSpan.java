import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static int[] findHighStock(int[] arr){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stc = new Stack<>();
        int new_arr[] = new int[arr.length];
        new_arr[0] = 1;
        st.push(arr[0]);
        stc.push(0);
        for(int i = 1; i <= arr.length-1; i++) {
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
                stc.pop();
            }
            if (st.size() == 0) {
                new_arr[i] = 1;
            }
            else{
                new_arr[i] = (i-stc.peek());
            }
            st.push(arr[i]);
            stc.push(i);
        }
        return new_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements of integer : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = findHighStock(arr);
        System.out.print("The new array is : ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}