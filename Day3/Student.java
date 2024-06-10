class Student {
    public String name;
    public int age;

    // Default constructor
    public Student() {
        name = "Default";
       age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.age = otherStudent.age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating three objects of the Student class using different constructors
        Student student1 = new Student();  // Default constructor
        Student student2 = new Student("John", 20);  // Parameterized constructor
        Student student3 = new Student(student2);  // Copy constructor

        // Displaying details for each student
        System.out.println("Details for student 1:");
        student1.displayDetails();

        System.out.println("\nDetails for student 2:");
        student2.displayDetails();

        System.out.println("\nDetails for student 3 (copy of student 2):");
        student3.displayDetails();
    }
}
