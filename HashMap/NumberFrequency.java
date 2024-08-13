import java.util.HashMap;

public class NumberFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,3,2,1,1,2,4,5};
        HashMap<Integer,Integer> cntfreq = new HashMap<>();
        for (int el : arr) {
            if (!cntfreq.containsKey(el)) {
                cntfreq.put(el, 1);
            }
            else{
                cntfreq.put(el, cntfreq.get(el)+1);
            }
        }
        System.out.println(cntfreq.entrySet());
        int key = -1;
        int maxFreq = -1;
        for (var hm : cntfreq.entrySet()) {
            if (hm.getValue() > maxFreq) {
                maxFreq = hm.getValue();
                key = hm.getKey();
            }
        }
        System.out.println("Max fraquency have the number : "+key + ", whose frequency is : "+maxFreq);
    }
} 
