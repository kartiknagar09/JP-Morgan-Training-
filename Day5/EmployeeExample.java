class Emp {
    int id;
    String name;
    int age;

    // Default constructor
    public Emp() {
        // Default values
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Display method to print the content of the object
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}

class PartTimeEmp extends Emp {
    int numberOfHours;
    double ratePerHour;

    // Default constructor
    public PartTimeEmp() {
        // Calls the default constructor of the base class (Emp)
        super();
        this.numberOfHours = 0;
        this.ratePerHour = 0.0;
    }

    // Parameterized constructor
    public PartTimeEmp(int id, String name, int age, int numberOfHours, double ratePerHour) {
        // Calls the parameterized constructor of the base class (Emp)
        super(id, name, age);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    // Display method to print the content of the object
    @Override
    public void display() {
        super.display();  // Call the display method of the base class (Emp)
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate per Hour: $" + ratePerHour);
    }
}

class FullTimeEmp extends Emp {
    double basicPay;
    double da;

    // Default constructor
    public FullTimeEmp() {
        // Calls the default constructor of the base class (Emp)
        super();
        this.basicPay = 0.0;
        this.da = 0.0;
    }

    // Parameterized constructor
    public FullTimeEmp(int id, String name, int age, double basicPay, double da) {
        // Calls the parameterized constructor of the base class (Emp)
        super(id, name, age);
        this.basicPay = basicPay;
        this.da = da;
    }

    // Display method to print the content of the object
    @Override
    public void display() {
        super.display();  // Call the display method of the base class (Emp)
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Dearness Allowance (DA): $" + da);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        // Create an object of PartTimeEmp using the default constructor
        PartTimeEmp partTimeEmployee = new PartTimeEmp();
        System.out.println("Part-Time Employee (Default Constructor) - Content:");
        partTimeEmployee.display();
        System.out.println();

        // Create an object of PartTimeEmp using the parameterized constructor
        PartTimeEmp partTimeEmployeeParam = new PartTimeEmp(101, "John Doe", 25, 20, 15.0);
        System.out.println("Part-Time Employee (Parameterized Constructor) - Content:");
        partTimeEmployeeParam.display();
        System.out.println();

        // Create an object of FullTimeEmp using the default constructor
        FullTimeEmp fullTimeEmployee = new FullTimeEmp();
        System.out.println("Full-Time Employee (Default Constructor) - Content:");
        fullTimeEmployee.display();
        System.out.println();

        // Create an object of FullTimeEmp using the parameterized constructor
        FullTimeEmp fullTimeEmployeeParam = new FullTimeEmp(102, "Jane Smith", 30, 50000.0, 8000.0);
        System.out.println("Full-Time Employee (Parameterized Constructor) - Content:");
        fullTimeEmployeeParam.display();
    }
}
