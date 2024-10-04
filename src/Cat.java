public class Cat extends Animal {

    // Explicitly inherits constructor from superclass with super keyword
    Cat (String name, int age) {
        super(name, age);
    }

    // Inherits abstract method from superclass to make animal-specific noise
    void makeSound() {
        System.out.println("Meow meow");
    }

    void groom() {
        System.out.println("(The cat starts grooming itself)");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Behavior: groom() \n");
    }
}
