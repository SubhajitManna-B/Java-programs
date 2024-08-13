import java.util.Scanner;

class TryCatch_01{
    public static void main(String[] args) {
        int marks[]=new int[5]; 
        System.out.println("Enter the five value in the array : ");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The value at array index entered is : ");
            int ind=sc.nextInt();
        System.out.println("Enter the number you want to divide value : ");
            int number=sc.nextInt();
        try{
            System.out.println("The value at array index "+ind+" is : "+marks[ind]);
            System.out.println("The value of array-value/number = "+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occur\nReason : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occur\nReason : "+e);
        }
        catch(Exception e){
            System.out.println("Exception occur\nReason : "+e);
        }
    }
}