public class Calculator {
    
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two floats
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Adding two integers
        int resultInt = calculator.add(5, 7);
        System.out.println("Sum of two integers: " + resultInt);

        // Adding two floats
        float resultFloat = calculator.add(3.5f, 2.7f);
        System.out.println("Sum of two floats: " + resultFloat);
    }
}
