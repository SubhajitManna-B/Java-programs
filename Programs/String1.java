import java.util.*;
//import java.io.*;

public class String1 {
   public static void main(String args []){
    Scanner obj=new Scanner (System.in);
    op1:
    op2:
    op3:
    for(int i=0;;i++)
    {
    System.out.println("Choose 1 for Concatenation/joining.");
    System.out.println("Choose 2 for Compare using compareTo() method.");
    System.out.println("Choose 3 for compare using equals() and equalIgnoreCase() method.");
    System.out.println("Choose 4 for StringBuffer length and capacity check.");
    System.out.println("Choose 5 for charAt() and setCharAt() method.");
    System.out.println("Choose 6 for delete() and deleteCharAt() method.");
    System.out.println("Choose 7 for append() and insert() method.");
    System.out.println("Choose 8 for exit");

    System.out.print("\nChoose which operation you want to do : ");
    int n=obj.nextInt();
    switch(n)
    {
        case 1:
        System.out.println("Write the first word :");
        String str1=obj.next();
        System.out.println("Write the second word :");
        String str2=obj.next();
        String str3=str1+str2;
        System.out.println("The result using concatenation operator is : "+str3);
        System.out.println("The result using concat method is : "+str1.concat(str2));
        break op1;
        case 2:
        System.out.println("Write the first word :");
        String str4=obj.next();
        System.out.println("Write the second word :");
        String str5=obj.next();
        System.out.println("The comparision between "+str4+" and "+str5+" is : "+str4.compareTo(str5));
        break op2;
        case 3:
        System.out.println("Write the first word :");
        String str6=obj.next();
        System.out.println("Write the second word :");
        String str7=obj.next();
        System.out.println("The comparision result using equals() method is : "+str6.equals(str7));
        System.out.println("The comparision result using equalIgnoreCase() method is : "+str6.equalsIgnoreCase(str7));        
        break op3;
        case 4:
        StringBuffer str8=new StringBuffer();
        System.out.println("Write the first word :");
        str8.append(obj.next());
        System.out.println("The length of "+str8+" is : "+str8.length());
        System.out.println("The capacity of "+str8+" is : "+str8.capacity()); 
        StringBuffer st1=new StringBuffer("bimal");
        System.out.println("The capacity of "+st1+" is : "+st1.capacity()); 
        break;
        case 5:
        StringBuffer str9=new StringBuffer();
        System.out.println("Write the word :");
        str9.append(obj.next());
        System.out.print("Enter which position's character you want to see : ");
        int pos=obj.nextInt();
        System.out.println("The character in position "+pos+" is : "+str9.charAt(pos));
        System.out.print("In which position you want to change : ");
        int pos1=obj.nextInt();
        System.out.print("write what you want to exchange : ");
        char ch=obj.next().charAt(0);
        str9.setCharAt(pos1,ch);
        System.out.println("The result after exchange is : "+str9);   
        break;
        case 8:
        System.exit(0);
        default:
        System.out.print("You chose the wrong option.");
     }
   }    
 } 
}
