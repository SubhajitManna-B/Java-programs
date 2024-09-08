


interface Computer {
    void show();
    void printName();
}


//Class Laptop implements the abstract class of the Computer
class Laptop implements Computer{
    @Override
    public void show(){
        System.out.println("In laptop show");
    }
    @Override
    public void printName(){
        System.out.println("I am Subhajit.");
    }
}


public class InterfaceWithImplement {
    public static void main(String[] args) {
        //You can use this method if you implement the interface in a class.
        Computer lap = new Laptop();
        lap.show();
        lap.printName();
    }
}
