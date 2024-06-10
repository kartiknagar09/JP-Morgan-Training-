// User-defined exception class for age less than 20
class AgeLessThan20Exception extends Exception {
    public AgeLessThan20Exception(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) throws AgeLessThan20Exception {
        // Validate age and throw an exception if it's less than 20
        if (age < 20) {
            throw new AgeLessThan20Exception("Age must be 20 years or more.");
        }

        // Initialize other attributes
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to demonstrate the usage
public class StudentExample {
    public static void main(String[] args) {
        try {
            // Creating a student with age less than 20 (to demonstrate the exception)
            Student student1 = new Student(1, "John Doe", 18); // This will throw AgeLessThan20Exception
        } catch (AgeLessThan20Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Creating a student with a valid age
        try {
            Student student2 = new Student(2, "Jane Smith", 22);
            System.out.println("Student details: ID=" + student2.getId() +
                    ", Name=" + student2.getName() + ", Age=" + student2.getAge());
        } catch (AgeLessThan20Exception e) {
            // This block won't be executed for a valid age
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
