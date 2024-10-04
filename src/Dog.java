public class Dog extends Animal {

    // Explicitly inherits constructor from superclass with super keyword
    Dog (String name, int age) {
        super(name, age);
    }

    // Inherits abstract method from superclass to make animal-specific noise
    void makeSound() {
        System.out.println("Bark bark");
    }

    // Animal-specific line for behavior
    void fetch() {
        System.out.println("(The dog chases a ball in the distance)");
    }

    // Explicitly inherits and outputs superclass method displayInfo, and displays animal-specific behavior after
    void displayInfo() {
        super.displayInfo();
        System.out.println("Behavior: fetch() \n");
    }
}