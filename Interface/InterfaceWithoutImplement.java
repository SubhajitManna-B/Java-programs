

interface Computer {
    void show();
    void printName();
}


public class InterfaceWithoutImplement {
    public static void main(String[] args) {
        //You can use this if you have multiple abstract function in your interface.
        Computer com = new Computer() {
            @Override
            public void show() {
                System.out.println("In computer show.");
            }
            public void printName(){
                System.out.println("I am Subhajit.");
            }
        };
        com.show();
        com.printName();
    }
}
