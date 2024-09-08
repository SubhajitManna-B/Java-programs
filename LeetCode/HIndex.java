import java.util.Arrays;


/*Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.*/

public class HIndex {

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = citations.length;
        for(int i = 0; i < h; i++){
            if(citations[i] >= h-i) return h-i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,6,1,5};
        int h = hIndex(arr);
        System.out.println("Researcher h-index = "+h);
    }
}
