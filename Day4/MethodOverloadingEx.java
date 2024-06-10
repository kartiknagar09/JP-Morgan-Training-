public class MethodOverloadingEx {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingEx obj = new MethodOverloadingEx();

        // Call the first add method with two integers
        int result1 = obj.add(2, 3);
        System.out.println("Result 1: " + result1);

        // Call the second add method with three integers
        int result2 = obj.add(2, 3, 5);
        System.out.println("Result 2: " + result2);

        // Call the third add method with two double values
        double result3 = obj.add(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
}
