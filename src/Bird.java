public class Bird extends Animal {
 
    // Explicitly inherits constructor from superclass with super keyword
    Bird (String name, int age) {
        super(name, age);
    }

    // Inherits abstract method from superclass to make animal-specific noise
    void makeSound() {
        System.out.println("Coo coo");
    }

    // Animal-specific line for behavior
    void fly() {
        System.out.println("(The bird flaps its wings and departs into the sky)");
    }

    // Explicitly inherits and outputs superclass method displayInfo, and displays animal-specific behavior after
    void displayInfo() {
        super.displayInfo();;
        System.out.println("Behavior: fly() \n");
    }
}
