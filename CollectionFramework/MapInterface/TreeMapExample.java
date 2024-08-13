//package MapInterface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // data is Unique 
        //new data override on old data
        //print in sorted order

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Subhajit");
        tm.put(2,"Manna");
        tm.put(5, "Boy");
        tm.put(4, "Good");
        tm.put(3, "Is");
        tm.put(10, ".");
        tm.put(7, "He");
        tm.put(8, "Is");
        tm.put(9, "Nice");
        tm.put(6, ".");
        tm.put(2, "Jit");
        tm.put(1, "Subha");
        System.out.println(tm);
        System.out.println(tm.keySet());
        System.out.println(tm.values());
        System.out.println(tm.entrySet());
    }
}
