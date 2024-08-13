//package JAVA.HashSet;

import java.util.HashSet;

public class LongestConsequtive {

    public static int longestConseq(int arr[]) {
        int max_len = 1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        for (int num : arr) {
            if (!hs.contains(num-1)) {
                int len = 1;
                int pres_num = num;
                while (hs.contains(pres_num+1)) {
                    len++;
                    pres_num++;
                }
                max_len = Math.max(max_len, len);
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,9,1,4,8,7,10};
        System.out.println(longestConseq(arr));
    }
}
