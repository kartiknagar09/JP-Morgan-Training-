import java.util.Stack;

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

public class StudentStackExample {
    public static void main(String[] args) {
        // Create a stack to store Student objects
        Stack<Student> studentStack = new Stack<>();

        // Push 5 students onto the stack
        studentStack.push(new Student(1, "John Doe", 20));
        studentStack.push(new Student(2, "Jane Smith", 22));
        studentStack.push(new Student(3, "Alice Johnson", 21));
        studentStack.push(new Student(4, "Bob Brown", 19));
        studentStack.push(new Student(5, "Emily Davis", 23));

        // Iterate through the stack and display information about each student
        System.out.println("Information about each student:");
        while (!studentStack.isEmpty()) {
            Student student = studentStack.pop();
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println();
        }
    }
}
