import java.lang.Math;

public class LargestSubarraySum_KadanesAlgo {

    static int subarraySum(int[] arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,8,3,2,-1,5,-3,-4,5,7};
        System.out.println("Sum of subarray : "+subarraySum(arr));
    }
}