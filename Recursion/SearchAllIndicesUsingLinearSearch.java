import java.util.ArrayList;

class SearchAllIndicesUsingLinearSearch{

    static ArrayList<Integer> searchAllIndices(int arr[], int len, int idx, int srch_element){
        ArrayList<Integer> arrIndx = new ArrayList<>(); 
        if (idx >= len) {
            return new ArrayList<Integer>();
        }
        if(srch_element == arr[idx]){
            arrIndx.add(idx);
        }
        ArrayList<Integer> small_ans = searchAllIndices(arr, len, idx+1, srch_element);
        arrIndx.addAll(small_ans);
        return arrIndx;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3,7,2,9,3,3,4,6,3,7,2};
        int len = arr.length;
        int idx = 0;
        int srch_element = 3;
        ArrayList<Integer> ans = searchAllIndices(arr, len, idx, srch_element);
        System.out.println(ans);
    }

}