//Multi Threading using implementing runnable

class MltThread1 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 1000) {
            System.out.println("I am laughing.");
            i++;
        }
    }
}

class MltThread2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("I am crying.");
        }
    }
}


public class MltiThrd2 {
    public static void main(String[] args) {
        MltThread1 obj1 = new MltThread1();
        Thread th1 = new Thread(obj1);

        MltThread2 obj2 = new MltThread2();
        Thread th2 = new Thread(obj2);

        th1.start();
        th2.start();
    }
}
