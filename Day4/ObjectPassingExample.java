class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectPassingExample {

    // Method that takes a Person object as a parameter and modifies it
    public static void modifyPerson(Person person) {
        person.name = "John Doe";  // Change the name
        person.age = 30;           // Change the age
    }

    public static void main(String[] args) {
        // Create a Person object
        Person myPerson = new Person("Alice", 25);

        // Display the original information
        System.out.println("Original Information:");
        myPerson.displayInfo();

        // Pass the Person object to the modifyPerson method
        modifyPerson(myPerson);

        // Display the modified information
        System.out.println("\nModified Information:");
        myPerson.displayInfo();
    }
}
