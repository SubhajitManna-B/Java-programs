import java.util.HashMap;
import java.lang.Math;

public class LargestSubArray0Sum {

    public static int largestSubArray(int []arr){
        int max_len = -1;
        int prefix_sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];
            if (hm.containsKey(prefix_sum)) {
                max_len = Math.max(max_len, i-hm.get(prefix_sum));
            }
            else{
                hm.put(prefix_sum, i);
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int a[] = {15,-2,2,-8,1,7,10};
        System.out.println(largestSubArray(a));
    }
}
