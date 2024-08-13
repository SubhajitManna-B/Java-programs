import java.util.*;
class StringSort{
     public static void main(String[] args) {
        String name[]=new String[20]; //create string
        Scanner obj =new Scanner (System.in);
        System.out.print("How many names you want to compare : "); //message
        int n=obj.nextInt();
        System.out.println("Enter the "+n+" names :");              //message
        for(int i=0;i<n;i++)                                 //loop for input the strings 
        {
            name[i]=obj.next();
        }
        //sorting the names
        for(int i=0;i<n;i++)                             //outer loop 
        {
            for(int j=i+1;j<n;j++)                     //innner loop
            {
                if(name[i].compareTo(name[j])>0)  //compare two striing
                {
                 String temp=name[i];         //swiping two data
                        name[i]=name[j];
                        name[j]=temp; 
                }
            }
        }
        System.out.println("The sorting list in Assending order : ");
        for(int i=0;i<n;i++)             //loop for printing the sorting list 
        {
            System.out.println(name[i]);
        }
    }
}