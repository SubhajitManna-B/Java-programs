import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArray {
    public static void main(String[] args) {
        int arr[] = {8,4,5,7,3,5,6,2,3,2,7,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(2);
        al.add(1);
        al.add(4);
        al.add(9);
        al.add(1);
        List<Integer> al2 = al.subList(2, 4);
        System.out.println(al2);
    }
}
