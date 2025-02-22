/*def LargeSmallSum(arr)
The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’
Assumption:
All array elements are unique
Treat the 0th position as even
NOTE
Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example
Input
arr:3 2 1 7 5 4
Output
7
Explanation
Second largest among even position elements(1 3 5) is 3
Second smallest among odd position element is 4
Thus output is 3+4 = 7*/



public class Question3 {

    public static int largeSmallSum(int arr[]){
        if (arr.length <= 3) return 0;
        int largeEven = Integer.MIN_VALUE;
        int secondLargeEven = Integer.MIN_VALUE;
        int smallOdd = Integer.MAX_VALUE;
        int secondSmallOdd = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (i%2 == 0) {
                if (arr[i] > largeEven) {
                    secondLargeEven = largeEven;
                    largeEven = arr[i];
                }
                else if (arr[i] > secondLargeEven) {
                    System.out.println(i+"-----");
                    secondLargeEven = arr[i];
                }
            }
            else{
                if(arr[i] < smallOdd) {
                    secondSmallOdd = smallOdd;
                    smallOdd = arr[i];
                }
                else if(arr[i] < secondSmallOdd) {
                    System.out.println(i+"---------");
                    secondSmallOdd = arr[i];
                }
            }
        }
        return secondLargeEven + secondSmallOdd;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        System.out.println(largeSmallSum(arr)); 
    }
}
