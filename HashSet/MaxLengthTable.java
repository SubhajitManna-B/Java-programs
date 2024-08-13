//package JAVA.HashSet;

import java.util.HashSet;

public class MaxLengthTable {

    public static int maxLength(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        int max_len = 0;
        for (int num : arr) {
            if (!hs.contains(num)) {
                hs.add(num);
                max_len = Math.max(max_len, hs.size());
            }
            else{
                hs.remove(num);
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,3,2,3};
        System.out.println(maxLength(arr));
    }
}
