abstract class Emp {
    int id;
    String name;
    int age;

    // Default constructor
    public Emp() 
{
        this.id = 0;
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Emp(int id, String name, int age) 
{
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

    // Abstract method to calculate salary
    public abstract double calculateSalary();
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

    // Implementation of calculateSalary for PartTimeEmp
    @Override
    public double calculateSalary() {
        return numberOfHours * ratePerHour;
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

    // Implementation of calculateSalary for FullTimeEmp
    @Override
    public double calculateSalary() {
        return basicPay + da;
    }
}

public class EmployeeExAbstract {
    public static void main(String[] args) {
        // Create an object of PartTimeEmp using the default constructor
        PartTimeEmp partTimeEmployee = new PartTimeEmp();
        System.out.println("Part-Time Employee (Default Constructor) - Content:");
        partTimeEmployee.showDetails();
        System.out.println("Calculated Salary: $" + partTimeEmployee.calculateSalary());
        System.out.println();

        // Create an object of PartTimeEmp using the parameterized constructor
        PartTimeEmp partTimeEmployeeParam = new PartTimeEmp(101, "John Doe", 25, 20, 15.0);
        System.out.println("Part-Time Employee (Parameterized Constructor) - Content:");
        partTimeEmployeeParam.showDetails();
        System.out.println("Calculated Salary: $" + partTimeEmployeeParam.calculateSalary());
        System.out.println();

        // Create an object of FullTimeEmp using the default constructor
        FullTimeEmp fullTimeEmployee = new FullTimeEmp();
        System.out.println("Full-Time Employee (Default Constructor) - Content:");
        fullTimeEmployee.showDetails();
        System.out.println("Calculated Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println();

        // Create an object of FullTimeEmp using the parameterized constructor
        FullTimeEmp fullTimeEmployeeParam = new FullTimeEmp(102, "Jane Smith", 30, 50000.0, 8000.0);
        System.out.println("Full-Time Employee (Parameterized Constructor) - Content:");
        fullTimeEmployeeParam.showDetails();
        System.out.println("Calculated Salary: $" + fullTimeEmployeeParam.calculateSalary());
    }
}
