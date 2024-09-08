public class MissingNumberInArray{

    public static int missingNumber(int arr[]){
        int sum = 0;
        int actualSum = (arr.length*(arr.length+1))/2;
        for (int i : arr) {
            sum += i;
        }
        return (actualSum - sum);
    }

    public static void main(String[] args) {
        int arr[] = {1,0,3,2,9,4,7,8,6};
        System.out.println("Missing number is : "+missingNumber(arr));
    }
}