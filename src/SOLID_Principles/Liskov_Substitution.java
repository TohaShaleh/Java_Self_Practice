package SOLID_Principles;

/*
The Liskov Substitution Principle states that objects of a superclass should be replaceable
with objects of a subclass without affecting the correctness of the program.
*/

class Bird {

    // defining a general method
    void eat() {
        System.out.println("Eating");
    }
}

class FlyingBird extends Bird {

    void fly() {
        System.out.println("Flying");
    }
}


class Penguin extends Bird {
    // Penguins can eat, so they inherit the eat() method from Bird but no fly method used here
    void swim() {
        System.out.println("Swimming");
    }
}


// Sparrows are flying birds, so they inherit both eat() and fly() methods by extending FlyingBird
class Sparrow extends FlyingBird {

}

public class Liskov_Substitution {
    public static void main(String[] args) {
        // Create instances of different birds
        Bird bird = new Bird();
        FlyingBird sparrow = new Sparrow();  // Sparrow is a flying bird
        Bird penguin = new Penguin();  // Penguin is a bird but cannot fly


        bird.eat();
        sparrow.eat();
        penguin.eat();

        // Test: Only FlyingBird or its subclasses can fly
        // penguin.fly();  // Compile-time error because Penguin does not have fly method

    }
}

