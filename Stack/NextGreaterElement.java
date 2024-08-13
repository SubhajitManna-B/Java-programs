import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] findNextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int new_arr[] = new int[arr.length];
        new_arr[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for (int i = arr.length-2; i >= 0; i--) {
            while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if (st.size() == 0) {
                new_arr[i] = -1;
            }
            else{
                new_arr[i] = st.peek();
            }
            st.push(arr[i]);
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
        int res[] = findNextGreater(arr);
        System.out.print("The new array is : ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
