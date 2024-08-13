import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListCollectionCls {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want to put : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements : ");
        for(int i = 0 ; i < n ; i++){
            int data = sc.nextInt();
            ls.add(data);
        }
        System.out.println("Original list is : "+ls);
        Collections.reverse(ls);
        System.out.println("Reverse array list is : "+ls);
        System.out.println("Sorted in ascending order : ");
        Collections.sort(ls);
        System.out.println(ls);
        System.out.println("Sorted in descending order : ");
        Collections.sort(ls,Collections.reverseOrder());
        System.out.println(ls);


        ArrayList<String> str_ls = new ArrayList<>();
        str_ls.add("Subha");
        str_ls.add("Jit");
        str_ls.add("Manna");
        str_ls.add("2002");
        System.out.println("Original list : "+str_ls);
        Collections.sort(str_ls);
        System.out.println("Sorted list in ascending order : "+str_ls);
        Collections.sort(str_ls,Collections.reverseOrder());
        System.out.println("Sorted in Descending order : "+str_ls);
    }
}
