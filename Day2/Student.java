import java.util.Scanner;

class Student {
    // Instance variables to store name and age
    private String name;
    private int age;

    // Method to get details from user input
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter student age: ");
        age = scanner.nextInt();
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }



    public static void main(String[] args) {
        // Creating three objects of the Student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Getting details and displaying for each student
        System.out.println("Enter details for student 1:");
        student1.getDetails();
        student1.displayDetails();

        System.out.println("\nEnter details for student 2:");
        student2.getDetails();
        student2.displayDetails();

        System.out.println("\nEnter details for student 3:");
        student3.getDetails();
        student3.displayDetails();
    }
}
