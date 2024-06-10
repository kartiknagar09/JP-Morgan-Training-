final class FinalClass {
    private int value;

    // Constructor
    public FinalClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // This method cannot be overridden in a subclass
    public final void displayValue() {
        System.out.println("Value: " + value);
    }
}

// The following line would result in a compilation error because FinalClass is final
// class SubClass extends FinalClass {}

public class FinalClassExample {
    public static void main(String[] args) {
        // Create an object of the final class
        FinalClass finalObj = new FinalClass(42);

        // Access methods of the final class
        System.out.println("Value: " + finalObj.getValue());
        finalObj.displayValue();
    }
}
