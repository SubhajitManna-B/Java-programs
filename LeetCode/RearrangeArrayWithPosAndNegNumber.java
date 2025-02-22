import java.util.ArrayList;

public class RearrangeArrayWithPosAndNegNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,-2,-4,5,-6,-8,7};
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
        for (Integer element : arr) {
            if (element > 0) posList.add(element);
            else negList.add(element); 
        }
        int j = 0;
        for (int i = 0; i < posList.size(); i++) {
            arr[j++] = posList.get(i);
            arr[j++] = negList.get(i);
        }
        for (Integer element : arr) {
            System.out.print(element+", ");
        }
    }
}
