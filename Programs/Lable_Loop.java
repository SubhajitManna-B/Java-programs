import java.util.Scanner;
import java.io.*;
class Lable_Loop
{
    public static void main(String args[])
    {
        int i,j;
        Loop1: for(i=1;i<=10;i++)
        {
            System.out.println("");
            if(i==6)
            {
                break;
            }
            for(j=1;j<=5;j++)
            {
                System.out.print("* ");
                if(i==j)
                {
                    continue Loop1;
                }
            }
        }
    }
}