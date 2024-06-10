public class OuterClass {

    // Instance variable in the outer class
    private int a;

    // Constructor to initialize the value of 'a'
    public OuterClass(int aValue) {
        this.a = aValue;
    }

    // Inner class
    public class InnerClass {

        // Instance variable in the inner class
        private int b;

        // Constructor to initialize the value of 'b'
        public InnerClass(int bValue) {
            this.b = bValue;
        }

        // Getter method for 'b'
        public int getB() {
            return b;
        }
    }

    // Getter method for 'a'
    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        // Create an object of the outer class
        OuterClass outerObj = new OuterClass(10);

        // Create an object of the inner class and assign an initial value to 'b'
        OuterClass.InnerClass innerObj = outerObj.new InnerClass(20);

        // Print the values of 'a' and 'b'
        System.out.println("Value of 'a': " + outerObj.getA());
        System.out.println("Value of 'b': " + innerObj.getB());
    }
}
