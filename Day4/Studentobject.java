import java.util.Scanner;

class Student {
    public String name;
    public int age;

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

    // Method to compare ages of two students and return the Student object with the highest age
    public static Student compareAges(Student student1, Student student2) {
        return (student1.age > student2.age) ? student1 : student2;
    }
}

public class Studentobject {
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
        Student studentWithHighestAge = Student.compareAges(student1, student2);
        System.out.println("\nStudent with the highest age: " + studentWithHighestAge.name);
    }
}
