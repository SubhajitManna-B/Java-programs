import java.util.Scanner;
import java.io.*;

public class InsertionSort {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int arr[];
        arr=new int[20];
        System.out.println("Enter the number of element : ");
        int n=obj.nextInt();
        System.out.println("Enter the elements : ");
        int i;
        for(i=0;i<n;i++)
        {
           arr[i]=obj.nextInt();
        }
        for(i=1;i<n;i++)
        {
            outer:
            for(int j=i;j>0;j--)
            {
                  int temp=arr[j];
                  if(arr[j-1]>arr[j])
                  {
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                  }
                  else
                  {
                    continue outer;
                  }
            }
        }
        for(i=0;i<n;i++)
        {
           System.out.println("The elements are : " +arr[i]);
        }
    }
    }