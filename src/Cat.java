public class Cat extends Animal {

    // Explicitly inherits constructor from superclass with super keyword
    Cat (String name, int age) {
        super(name, age);
    }

    // Inherits abstract method from superclass to make animal-specific noise
    void makeSound() {
        System.out.println("Meow meow");
    }

    // Animal-specific line for behavior
    void groom() {
        System.out.println("(The cat starts grooming itself)");
    }

    // Explicitly inherits and outputs superclass method displayInfo, and displays animal-specific behavior after
    void displayInfo() {
        super.displayInfo();
        System.out.println("Behavior: groom() \n");
    }
}
