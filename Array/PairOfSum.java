import java.util.Scanner;

class PairOfSum{
    static int pairOfSum(int arr[], int x,int n){
        int ans = 0;
        for(int i=0; i < n-1; i++){
            for(int j=i+1; j < n; j++){
                if(arr[i] + arr[j] == x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
        System.out.println("Enter the range of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum which pairs we have to find : ");
        int x = sc.nextInt();
        int res = pairOfSum(arr,x,n); 
        System.out.println("We found total "+res+" no of pairs.");
    }
}