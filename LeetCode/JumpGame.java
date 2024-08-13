class JumpGame{

    public boolean canJump(int[] arr) {
        int goal = arr.length-1; 
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] + i >= goal){
                goal = i;
            }
        }
        if (goal == 0) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        JumpGame obj = new JumpGame();
        if(obj.canJump(arr)) System.out.println("Reached to final destination.");
        else System.out.println("Not reached to final destination.");
    }
}