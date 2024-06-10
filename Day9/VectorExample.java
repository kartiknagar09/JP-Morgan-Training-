import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a vector
        Vector<Integer> vector = new Vector<>();

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Display the vector
        System.out.println("Vector: " + vector);

        // Get the element at index 2
        int elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Remove the element at index 3
        vector.remove(3);
        System.out.println("Vector after removing element at index 3: " + vector);

        // Check if the vector contains element 30
        boolean containsElement30 = vector.contains(30);
        System.out.println("Does the vector contain element 30? " + containsElement30);

        // Get the size of the vector
        int size = vector.size();
        System.out.println("Size of vector: " + size);
    }
}
