//Multi Threding

class multithreding extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 1 is running.");
        }
    }
}

class multithreding2 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 2 is running.");
        }
    }
}

public class MultThrd {
    public static void main(String[] args) {
        multithreding mlt1 = new multithreding();
        multithreding2 mlt2 = new multithreding2();
        mlt1.start();
        mlt2.start();
    }
}