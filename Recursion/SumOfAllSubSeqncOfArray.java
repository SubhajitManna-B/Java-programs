public class SumOfAllSubSeqncOfArray {

    static void sumOfSubSequences(int arr[], int len, int idx, int currSubsetSum){
        if(idx >= len){
            System.out.println(currSubsetSum);
            return;
        }
        sumOfSubSequences(arr, len, idx+1, currSubsetSum + arr[idx]);
        sumOfSubSequences(arr, len, idx+1, currSubsetSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        sumOfSubSequences(arr, arr.length, 0, 0);
    }
}
