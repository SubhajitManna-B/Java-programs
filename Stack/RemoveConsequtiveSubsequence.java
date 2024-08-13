import java.util.Scanner;
import java.util.Stack;

public class RemoveConsequtiveSubsequence {

    public static int[] removeSubsequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int present_no = arr[i];
            if (st.size() == 0 || st.peek() != present_no) {
                st.push(present_no);
            }
            else if (st.peek() == present_no) {
                if (i == arr.length-1 || arr[i] != arr[i+1]) st.pop(); 
            }
        }
        int sub_arr[] = new int[st.size()];
        for (int i = (sub_arr.length)-1; i >= 0; i--) {
            sub_arr[i] = st.pop();
        }
        return sub_arr;
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
        int res[] = removeSubsequence(arr);
        System.out.print("The new array is : ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
