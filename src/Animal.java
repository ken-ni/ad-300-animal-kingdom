public abstract class Animal {
    String name;
    int age;

    // Superclass constructor with basic fields
    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Prints generic food info
    void eat() {
        System.out.println("Yummy food");
    }

    // Prints generic sleep noises
    void sleep() {
        System.out.println("Zzz");
    }

    // Displays name and age of animal
    void displayInfo() {
        System.out.print("Name: " + this.name + "\nAge: " + this.age + "\n");
    }

    // Abstract method that each specific animal will customize with their own noise
    abstract void makeSound();
}