class Animal {
    public void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Dynamic dispatch - method call is determined at runtime
        animal1.makeSound();  // Calls Dog's makeSound method
        animal2.makeSound();  // Calls Cat's makeSound method
    }
}
