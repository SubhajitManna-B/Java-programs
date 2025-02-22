import java.lang.Math;

public class MaxProfitInStock {
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
        int profit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            buyPrice = Math.min(buyPrice, arr[i]);
            profit = Math.max(profit, arr[i]-buyPrice);
        }
        System.out.println("Profit = "+profit);
    }
}