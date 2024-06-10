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

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student [ID: " + id + ", Name: " + name + ", Age: " + age + "]";
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself, return true
        if (obj == this) {
            return true;
        }

        // If the object is not an instance of Student, return false
        if (!(obj instanceof Student)) {
            return false;
        }

        // Typecast obj to Student so that we can compare data members
        Student student = (Student) obj;

        // Compare the data members and return accordingly
        return id == student.id && name.equals(student.name) && age == student.age;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student(1, "John Doe", 20);
        Student student2 = new Student(2, "Jane Smith", 22);

        // Display the details of student1 using toString() method
        System.out.println("Details of student1: " + student1);

        // Test equals() method
        if (student1.equals(student2)) {
            System.out.println("student1 and student2 are equal.");
        } else {
            System.out.println("student1 and student2 are not equal.");
        }

        // Create a duplicate of student1
        Student student1Duplicate = new Student(1, "John Doe", 20);

        // Test equals() method with the duplicate object
        if (student1.equals(student1Duplicate)) {
            System.out.println("student1 and student1Duplicate are equal.");
        } else {
            System.out.println("student1 and student1Duplicate are not equal.");
        }
    }
}
