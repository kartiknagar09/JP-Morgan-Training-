import java.util.Scanner;

class StudentModify {
    public String name;
    public int age;

    // Default constructor
    public StudentModify() {
        this("Default", 0); // Call parameterized constructor with default values
    }

    // Parameterized constructor
    public StudentModify(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public StudentModify(StudentModify otherStudent) {
        this(otherStudent.name, otherStudent.age); // Call parameterized constructor with values from otherStudent
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Creating three objects of the Student class using different constructors
        StudentModify student1 = new StudentModify();  // Default constructor
        StudentModify student2 = new StudentModify("John", 20);  // Parameterized constructor
        StudentModify student3 = new StudentModify(student2);  // Copy constructor

        // Displaying details for each student
        System.out.println("Details for student 1:");
        student1.displayDetails();

        System.out.println("\nDetails for student 2:");
        student2.displayDetails();

        System.out.println("\nDetails for student 3 (copy of student 2):");
        student3.displayDetails();
    }
}
