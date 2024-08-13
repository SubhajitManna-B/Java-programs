import java.util.*;

class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many element you want to print : ");
        int n=sc.nextInt();
        int arr[]= new int [20];
        System.out.print("Enter the element : ");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("For loop .......................");   
        for(int i=1;i<=n;i++){
            System.out.println("The elements are: "+arr[i]);
        }
        int arr2[]={1,2,8,3,5};
        System.out.println("For each loop .......................");
        for (int element : arr2) {
            System.out.println("The elements are : " +element);
        }
    }
} 