class One extends Thread {
public void run() 
{
    for(int i=1;i<=5;i++)
    {
        System.out.println("This is class one -"+i);
    }
    System.out.println("The class one exit");
}    
}

class Two extends Thread {
    public void run()
    {
        for(int i=6;i<=10;i++)
        {
            System.out.println("This is class two -"+i);  
        }
        System.out.println("The class two exit");
    }
}

class Thread1{
    public static void main(String arg []){
        One obj1=new One();
        Two obj2=new Two();
        obj1.start();
        obj2.start();
    }
}
