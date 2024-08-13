//package CollectionInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

    public static void hashSetExample(){  //hashSet elements are have unique value but in unordered.
        HashSet<Integer> hset = new HashSet<>();
        hset.add(11);
        hset.add(2);
        hset.add(31);
        hset.add(14);
        hset.add(2);
        hset.add(21);
        hset.add(4);
        hset.add(51);
        hset.add(6);
        hset.add(7);
        System.out.println(hset);
        System.out.println(hset.remove(2));
        System.out.println(hset);
        System.out.println(hset.contains(2));
        System.out.println(hset.remove(2));
        System.out.println();
    }

    public static void linkedHashSetExample(){
        //unique value
        //elemets are print in insertion order
        //LinkedList + Hash Table
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(31);
        lhs.add(14);
        lhs.add(2);
        lhs.add(21);
        lhs.add(4);
        lhs.add(51);
        lhs.add(11);
        lhs.add(11);
        lhs.add(6);
        lhs.add(7);
        lhs.add(7);
        lhs.add(7);
        System.out.println(lhs);
        System.out.println();
    }

    public static void treeSetExample(){
        //unique value
        //print in sorted order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(12);
        ts.add(11);
        ts.add(11);
        ts.add(11);
        ts.add(18);
        ts.add(34);
        ts.add(31);
        ts.add(35);
        ts.add(71);
        ts.add(7);
        ts.add(32);
        ts.add(2);
        System.out.println(ts);
    }

    public static void main(String[] args) {
        hashSetExample();
        linkedHashSetExample();
        treeSetExample();
    }
}
