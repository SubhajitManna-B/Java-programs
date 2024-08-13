import java.util.HashMap;

public class TwoSumPair {

    public static int[] findSumPair(int []arr, int target){
        int ans[] = {-1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int find_num = target - arr[i];
            if (hm.containsKey(find_num)) {
                ans = new int[]{hm.get(find_num),i};
                return ans;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int a[] = findSumPair(arr, 6);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
