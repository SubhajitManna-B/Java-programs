class Loop implements Runnable 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("This is loop class "+i);
        }
    }
}
 class Thread2 {
    public static void main(String args[])
    {
        Loop loopobj=new Loop();
        Thread obj=new Thread(loopobj);
        obj.start();
        for(int j=1;j<=5;j++)
        {
            System.out.println("This is Main class "+j);
        }
    }
}
