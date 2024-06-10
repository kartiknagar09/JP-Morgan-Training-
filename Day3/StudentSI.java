class StudentSI {
    private String name;
    private int age;

    // Initializer block
    {
        System.out.println("Initializer block called before constructors.");
    }

    // Default constructor
    public StudentSI() {
        this("Default", 0); // Calling parameterized constructor with default values
    }

    // Parameterized constructor
    public StudentSI(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public StudentSI(StudentSI otherStudent) {
        this.name = otherStudent.name;
        this.age = otherStudent.age;
    }

    // Static block
    static {
        System.out.println("Static block called once during class initialization.");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating three objects of the Student class using different constructors
        StudentSI student1 = new StudentSI();  // Default constructor
        StudentSI student2 = new StudentSI("John", 20);  // Parameterized constructor
        StudentSI student3 = new StudentSI(student2);  // Copy constructor

        // Displaying details for each student
        System.out.println("Details for student 1:");
        student1.displayDetails();

        System.out.println("\nDetails for student 2:");
        student2.displayDetails();

        System.out.println("\nDetails for student 3 (copy of student 2):");
        student3.displayDetails();
    }
}
