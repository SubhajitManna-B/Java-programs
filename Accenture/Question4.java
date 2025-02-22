/*def ProductSmallestPair(sum, arr)
The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair
NOTE
Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Example
Input
sum:9
size of Arr = 7
Arr:5 2 4 3 9 7 1
Output
2
Explanation
Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2
Sample Input
sum:4
size of Arr = 6
Arr:9 8 3 -7 3 9
Sample Output
-21*/




public class Question4 {

    public static int productSmallestPair(int sum, int arr[]){
        if(arr.length < 2) return -1;
        int firstSmallestEle = Integer.MAX_VALUE;
        int secondSmallestEle = Integer.MAX_VALUE;
        for (int i : arr) {
            if(firstSmallestEle > i){
                secondSmallestEle = firstSmallestEle;
                firstSmallestEle = i;
            }
            else if(secondSmallestEle > i) secondSmallestEle = i;
        }
        if((firstSmallestEle + secondSmallestEle) <= sum) return firstSmallestEle*secondSmallestEle;
        else return 0;
    }

    public static void main(String[] args) {
        int sum = 12;
        int arr[] = {5,8,9,6,3};
        System.out.println(productSmallestPair(sum, arr));    
    }
}