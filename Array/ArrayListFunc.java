import java.util.*;

class ArrayListFunc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();

        //add elements in the arrray
        ls.add(5);
        ls.add(23);
        ls.add(43);
        ls.add(85);
        ls.add(53);

        
        // get or print data at any index
        System.out.println(ls.get(3));
        System.out.println(ls.get(1));

        
        //print with loop
        for(int i = 0 ; i < ls.size() ; i++){
            System.out.print(ls.get(i)+" ");
        }
        System.out.println();

        
        //print the array list directly
        System.out.println(ls);


        //adding element at any index
        ls.add(5,38);
        ls.add(2,87);
        System.out.println(ls);


        //modifying element at any index
        ls.set(1,100);
        System.out.println(ls);


        //remove any element at index i
        ls.remove(2);
        System.out.println(ls);


        //remove any element
        System.out.println(ls.remove(Integer.valueOf(100)));
        System.out.println(ls);
        System.out.println(ls.remove(Integer.valueOf(21)));


        //checking if an element exists
        boolean ans = ls.contains(Integer.valueOf(60));
        System.out.println(ans); 


        //If you don't specify class, you can store/put anything inside arrayList
        ArrayList l = new ArrayList<>();
        l.add("Subha");
        l.add(2002);
        l.add(true);
        l.add(5.2f);
        System.out.println(l);

    }
}