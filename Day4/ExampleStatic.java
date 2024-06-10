public class ExampleStatic {
    // Static variable
    private static int instanceCount = 0;

    // Instance variable
    private String instanceName;

    // Constructor
    public ExampleStatic(String name) {
        this.instanceName = name;
        // Increment the static variable every time a new instance is created
        instanceCount++;
    }

    // Static method
    public static void printInstanceCount() {
        System.out.println("Number of instances created: " + instanceCount);
    }

    // Instance method
    public void printInstanceDetails() {
        System.out.println("Instance name: " + instanceName);
    }

    public static void main(String[] args) {
        // Creating instances of the class
        ExampleStatic instance1 = new ExampleStatic("Instance 1");
        ExampleStatic instance2 = new ExampleStatic("Instance 2");
        ExampleStatic instance3 = new ExampleStatic("Instance 3");

        // Calling static method using the class name
        ExampleStatic.printInstanceCount();

        // Calling instance methods
        instance1.printInstanceDetails();
        instance2.printInstanceDetails();
        instance3.printInstanceDetails();
    }
}
