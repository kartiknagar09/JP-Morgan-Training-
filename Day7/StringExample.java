public class StringExample {
    public static void main(String[] args) {
        // Example of toString method
        String str1 = "Hello, World!";
        String str2 = "Java";

        // Using toString explicitly
        String str3 = str1.toString(); // Same as str1
        System.out.println("str3 using toString: " + str3);

        // Example of equals method
        String str4 = "Hello, World!";
        String str5 = new String("Hello, World!"); // Creating a new string with the same content

        // Using equals method for string comparison
        boolean isEqual = str4.equals(str5);
        System.out.println("Are str4 and str5 equal? " + isEqual);

        // Using equalsIgnoreCase for case-insensitive comparison
        String str6 = "hello, world!";
        boolean isIgnoreCaseEqual = str4.equalsIgnoreCase(str6);
        System.out.println("Are str4 and str6 equal ignoring case? " + isIgnoreCaseEqual);
    }
}
