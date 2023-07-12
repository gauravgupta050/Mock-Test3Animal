// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// Subclass Cow
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos");
    }
}

// Main program
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog, Cat, and Cow
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // Calling makeSound() method on each object
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}