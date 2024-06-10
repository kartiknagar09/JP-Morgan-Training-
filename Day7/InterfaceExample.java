// Interface Ione with class constant a
interface Ione {
    int a = 10;
}

// Interface Itwo with class constant b
interface Itwo {
    int b = 20;
}

// Interface Ithree inheriting Ione and Itwo
interface Ithree extends Ione, Itwo {
    // Class constant c
    int c = 30;
}

// Class Test implementing Ithree
class Test implements Ithree {
    // Implementation of Ithree's abstract methods (if any)
}

// Main class to demonstrate
public class InterfaceExample {
    public static void main(String[] args) {
        // Create an object of Test class
        Test testObject = new Test();

        // Accessing class constants from interfaces
        System.out.println("Value of a: " + Ione.a);
        System.out.println("Value of b: " + Itwo.b);
        System.out.println("Value of c: " + Ithree.c);
    }
}
