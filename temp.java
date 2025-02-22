import java.util.HashMap;
import java.util.Map;
import java.util.*;

class temp{
    public static void main(String[] args) {
        // int i, j, print = 1;
        // for(i=1 ; i<=5; i++){
        //     for(j=1; j<=1; j++){
        //         System.out.print(print+" ");
        //     }
        //     System.out.println();
        // }
        // String str = new String("Subha");
        // String str2 = new String("Subha");
        // //String str = "Subha";
        // //String str2 = "Subha";
        // System.out.println(str.equals(str2));

        // // String str = new String("Subhajit");
        // // str = str.substring(0,4) + 'o' + str.substring(5);
        // // System.out.println(str);


        // int arr[] = {1,2,5,7,5,5,8,7,2,3,4,5,9,8,7,6,3};
        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for (int i : arr) {
        //     if(hm.containsKey(i)) hm.put(i,hm.get(i)+1);
        //     else hm.put(i, 1);
        // }
        // for (Map.Entry<Integer,Integer> list : hm.entrySet()) {
        //     System.out.println(list.getKey() +" = "+list.getValue());
        // }

        // int val = 10;
        // String binStr = Integer.toBinaryString(val);
        // String octStr = Integer.toOctalString(val);
        // String hexDecStr = Integer.toHexString(val);
        // System.out.println(binStr+", "+octStr+", "+hexDecStr);

        // int a = Integer.parseInt(binStr);
        // int b = Integer.valueOf(octStr);
        // int c = a+b;
        // System.out.println(c);
        // switch (val) {
        //     case 10 : System.out.println("10");
        //     case 20 -> System.out.println("20");
        //     default -> 30;
        // }

        // Map<Integer,Integer> hm = new HashMap<>();
        // hm.put(1, 8);
        // hm.put(2,6);
        // hm.putIfAbsent(1, 5);
        // boolean ch = hm.replace(1, 8, 11);
        // System.out.println(ch);
        // for (Map.Entry<Integer,Integer> es : hm.entrySet()) {
        //     System.out.println(es.getKey()+" "+es.getValue());
        // }
        //System.out.println(hm.entrySet());
        //hm.clear();
        //System.out.println(hm);


        HashSet<Character> hs = new HashSet<>();

        Random rand = new Random();
        System.out.println(rand.nextInt(5)+1);
    }
}