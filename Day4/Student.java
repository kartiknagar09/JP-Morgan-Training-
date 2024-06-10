class Student {
    private String name;
    private int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Method to display details
    public void displayDetails() {
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
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

    public static void main(String[] args) {
        // Creating three objects of the Student class using different constructors
        Student student1 = new Student("John", 20);  // Parameterized constructor
        Student student2 = new Student("Alice", 22);  // Parameterized constructor

        // Displaying details for each student
        System.out.println("\nDetails for student 1:");
        student1.displayDetails();

        System.out.println("\nDetails for student 2:");
        student2.displayDetails();

        // Comparing ages and printing the name of the student with the highest age
        System.out.println("\nComparing ages:");
        Student.compareAges(student1, student2);
    }
}
