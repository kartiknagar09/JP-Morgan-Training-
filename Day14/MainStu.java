import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class MainStu {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 20));
        students.add(new Student(2, "Alice", 22));
        students.add(new Student(3, "Bob", 21));
        students.add(new Student(4, "Emily", 19));
        students.add(new Student(5, "Michael", 23));

        // Write objects to file
        try {
	PrintWriter writer = new PrintWriter("students.txt");
            for (Student student : students) {
                writer.println(student.getId() + "," + student.getName() + "," + student.getAge());
            }
            System.out.println("Objects written to file successfully.");
     writer.close();   
} 
catch (IOException e) {
            e.printStackTrace();
        }

        // Read student information based on ID provided by the user
        int idToFind = Integer.parseInt(args[0]);
        try{ 

	BufferedReader reader = new BufferedReader(new FileReader("students.txt")); 
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                if (id == idToFind) {
                    System.out.println("Student found:");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    break;
                }
            }
	reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
