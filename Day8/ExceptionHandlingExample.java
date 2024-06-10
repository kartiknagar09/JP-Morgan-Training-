public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // ArrayIndexOutOfBoundsException example
           int[] numbers = {1, 2, 3};
            int element = numbers[5]; // Accessing an index that doesn't exist

            // ArithmeticException (DivideByZero) example
            int result = 10 / 0; // Attempting to divide by zero
        } 
catch (ArrayIndexOutOfBoundsException e) 
{	 System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
       
 } 
catch (ArithmeticException e)
 {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
	
        } 
finally {

            System.out.println("Finally block: This block always executes, whether an exception occurs or not.");
        }

        // Rest of the program continues...
        System.out.println("Program continues after exception handling.");
    }
}
