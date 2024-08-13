// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Derived class 1
class Mammal extends Animal {
    void run() {
        System.out.println("Mammal is running.");
    }
}

// Derived class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the derived class Dog
        Dog myDog = new Dog();

        // Accessing methods from the base class Animal
        myDog.eat();

        // Accessing methods from the intermediate class Mammal
        myDog.run();

        // Accessing methods from the derived class Dog
        myDog.bark();
    }
}
