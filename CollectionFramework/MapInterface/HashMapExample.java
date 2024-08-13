//package

import java.util.HashMap;


public class HashMapExample {
    public static void main(String[] args) {

        // data is Unique 
        //new data override on old data
        //not in order

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(11,"Subhajit");
        hm.put(12,"Manna");
        hm.put(13, "Boy");
        hm.put(14, "Good");
        hm.put(15, "Is");
        hm.put(16, ".");
        hm.put(17, "He");
        hm.put(18, "Is");
        hm.put(19, "Nice");
        hm.put(20, ".");
        System.out.println(hm);
    }
}
