class Emp {
    int id;
    String name;
    int age;

    // Default constructor
    public Emp() {
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

    // Get details method
    public String getDetails() {
        return "Employee ID: " + id + "\nEmployee Name: " + name + "\nEmployee Age: " + age;
    }

    // Show details method
    public void showDetails() {
        System.out.println(getDetails());
    }
}

class PartTimeEmp extends Emp {
    int numberOfHours;
    double ratePerHour;

    // Default constructor
    public PartTimeEmp() {
        super();
        this.numberOfHours = 0;
        this.ratePerHour = 0.0;
    }

    // Parameterized constructor
    public PartTimeEmp(int id, String name, int age, int numberOfHours, double ratePerHour) {
        super(id, name, age);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    // Get details method
    @Override
    public String getDetails() {
        return super.getDetails() + "\nNumber of Hours: " + numberOfHours + "\nRate per Hour: $" + ratePerHour;
    }

    // Show details method
    @Override
    public void showDetails() {
        System.out.println(getDetails());
    }
}

class FullTimeEmp extends Emp {
    double basicPay;
    double da;

    // Default constructor
    public FullTimeEmp() {
        super();
        this.basicPay = 0.0;
        this.da = 0.0;
    }

    // Parameterized constructor
    public FullTimeEmp(int id, String name, int age, double basicPay, double da) {
        super(id, name, age);
        this.basicPay = basicPay;
        this.da = da;
    }

    // Get details method
    @Override
    public String getDetails() {
        return super.getDetails() + "\nBasic Pay: $" + basicPay + "\nDearness Allowance (DA): $" + da;
    }

    // Show details method
    @Override
    public void showDetails() {
        System.out.println(getDetails());
    }
}
public class EmployeeExample {
    public static void main(String[] args) {
        // Create an object of Emp class pointing to an instance of PartTimeEmp
        Emp empReferenceToPartTime = new PartTimeEmp(101, "John Doe", 25, 20, 15.0);

        System.out.println("Emp class pointing to PartTimeEmp - Content:");
        empReferenceToPartTime.showDetails();
        System.out.println();

        // Create an object of Emp class pointing to an instance of FullTimeEmp
        Emp empReferenceToFullTime = new FullTimeEmp(102, "Jane Smith", 30, 50000.0, 8000.0);

        System.out.println("Emp class pointing to FullTimeEmp - Content:");
        empReferenceToFullTime.showDetails();
    }
}
