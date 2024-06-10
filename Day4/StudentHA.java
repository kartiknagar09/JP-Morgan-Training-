import java.util.Scanner;

class Student {
    private String name;
    private int age;

    // Method to get details from user input
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter student age: ");
        this.age = scanner.nextInt();
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to compare ages of two students and print the name of the one with higher age
    public static void compareAges(Student student1, Student student2) {
        if (student1.age > student2.age) {
            System.out.println(student1.name + " has the highest age.");
        } else if (student1.age < student2.age) {
            System.out.println(student2.name + " has the highest age.");
        } else {
            System.out.println("Both students have the same age.");
        }
    }
}

public class StudentHA {
    public static void main(String[] args) {
        // Creating two objects of the Student class
        Student student1 = new Student();
        Student student2 = new Student();

        // Getting details and displaying for each student
        System.out.println("Enter details for student 1:");
        student1.getDetails();
        student1.displayDetails();

        System.out.println("\nEnter details for student 2:");
        student2.getDetails();
        student2.displayDetails();

        // Comparing ages and printing the name of the student with the highest age
        Student.compareAges(student1, student2);
    }
}
