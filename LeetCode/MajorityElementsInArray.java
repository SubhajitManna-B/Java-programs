import java.util.HashMap;

public class MajorityElementsInArray {
    
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int no : nums){
            if(!hs.containsKey(no)){
                hs.put(no,1);
            }
            else{
                hs.put(no,hs.get(no)+1);
            }
        }
        int major_ele = nums.length/2;
        int ans = 0;
        for(var list : hs.entrySet()){
            if(list.getValue() > major_ele){
                major_ele = list.getValue();
                ans = list.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
