import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Instantiate new animal objects from Animal class
        Animal cat = new Cat("Meowth", 7);
        Animal bird = new Bird("Birdy", 10);
        Animal dog = new Dog("Spot", 2);

        // Create and add animal objects to animals ArrayList for us to loop through
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(bird);
        animals.add(dog);

        // Loop through all animals in animals ArrayList. For each animal:
        for (Animal animal: animals) {
            // Display eating text (inherited)
            animal.eat();
            // Display sleeping text (inherited)
            animal.sleep();

            // If animal is a cat, dog, or bird print their behavior text
            if (animal instanceof Cat) {
                ((Cat)animal).groom();
            } else if (animal instanceof Bird) {
                ((Bird)animal).fly();
            } else if (animal instanceof Dog) { 
                ((Dog)animal).fetch();
            }

            // Display information of every animal
            animal.displayInfo();
        }
    }
}