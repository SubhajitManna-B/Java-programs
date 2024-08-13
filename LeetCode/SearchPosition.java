public class SearchPosition{

    public static int searchPos(int nums[], int target){
        int i=0;
        while(i<nums.length && nums[i] < target){
            if(target == nums[i]){
                return i;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8,9};
        int ar[] = new int[9];
        ar = arr;
        System.out.println(arr.length);
        System.out.println(ar.length);
        int target = 6;
        //System.out.println("result = " +searchPos(ar, target));
    }
}