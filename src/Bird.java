public class Bird extends Animal {
 
    Bird (String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Coo coo");
    }

    void fly() {
        System.out.println("(The bird flaps its wings and departs into the sky)");
    }

    void displayInfo() {
        super.displayInfo();;
        System.out.println("Behavior: fly() \n");
    }
}
