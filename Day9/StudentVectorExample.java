import java.util.Vector;

// Student class
class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
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

public class StudentVectorExample {
    public static void main(String[] args) {
        // Create a vector to store Student objects
        Vector<Student> studentVector = new Vector<>();

        // Add 5 students to the vector
        studentVector.add(new Student(1, "John Doe", 20));
        studentVector.add(new Student(2, "Jane Smith", 22));
        studentVector.add(new Student(3, "Alice Johnson", 21));
        studentVector.add(new Student(4, "Bob Brown", 19));
        studentVector.add(new Student(5, "Emily Davis", 23));

        // Iterate through the vector and display information about each student
        System.out.println("Information about each student:");
        for (Student student : studentVector) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }
    }
}
