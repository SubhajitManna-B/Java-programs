import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Akash", 21);
        hm.put("Yash", 16);
        hm.put("Lav", 17);
        hm.put("Rishika", 19);
        hm.put("Harry", 18);

        //Getting value of a key from HashMap
        System.out.println(hm.get("Yash"));
        System.out.println(hm.get("Rishika"));
        System.out.println();

        //Changing value of a key in the HashMap
        hm.put("Lav", 20);
        System.out.println(hm.get("Lav"));
        System.out.println();

        //Removing a pair from the HashMap
        System.out.println(hm.remove("Akash"));
        System.out.println(hm.remove("Lav", 20));
        System.out.println();

        //Check a key if in the HashMap
        System.out.println(hm.containsKey("Yash"));
        System.out.println(hm.containsKey("Lav"));
        System.out.println();

        //Adding a new entry only if the new key doesn't exist already
        hm.putIfAbsent("Ajay", 22);
        hm.putIfAbsent("Yash", 23);
        System.out.println();

        //Get all keys in the HashMap
        System.out.println(hm.keySet());
        System.out.println();

        //Get all values in the HashMap
        System.out.println(hm.values());
        System.out.println();

        //Get all entries in the HashMap
        System.out.println(hm.entrySet());
        System.out.println();

        //Traversing all entries of HashMap
        for (String key : hm.keySet()) {
            System.out.printf("\nThe age of %s is %d",key,hm.get(key));
        }

        System.out.println();

        for (HashMap.Entry<String,Integer> e: hm.entrySet()) {
            System.out.printf("\nThe age of %s is %d",e.getKey(),e.getValue());
        }
    }
}