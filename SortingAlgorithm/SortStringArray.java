public class SortStringArray {

    public void sortStrings(String str[]) {
        for (int i = 0; i < str.length-1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < str.length; j++) {
                if (str[minIdx].compareTo(str[j]) > 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                String temp = str[i];
                str[i] = str[minIdx];
                str[minIdx] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String str[] = { "Mango", "Apple", "Orange", "Goava", "Stawberry" };
        System.out.println("Before sorting : ");
        for (String st : str) {
            System.out.println(st);
        }
        System.out.println();
        SortStringArray obj = new SortStringArray();
        obj.sortStrings(str);
        System.out.println("After sorting in ascending order : ");
        for (String st : str) {
            System.out.println(st);
        }
    }
}
