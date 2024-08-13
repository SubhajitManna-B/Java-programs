//package MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // data is Unique 
        //new data override on old data
        //print in insertion order

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1,"Subhajit");
        lhm.put(2,"Manna");
        lhm.put(5, "Boy");
        lhm.put(4, "Good");
        lhm.put(3, "Is");
        lhm.put(10, ".");
        lhm.put(7, "He");
        lhm.put(8, "Is");
        lhm.put(9, "Nice");
        lhm.put(6, ".");
        System.out.println(lhm);
    }
}
