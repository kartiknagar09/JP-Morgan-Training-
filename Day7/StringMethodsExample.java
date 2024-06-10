public class StringMethodsExample {
    public static void main(String[] args) {
        // Creating a string
        String originalString = "Hello, World!";

        // Getting information
        int length = originalString.length();
        char firstChar = originalString.charAt(0);
        boolean isEmpty = originalString.isEmpty();

        System.out.println("Original String: " + originalString);
        System.out.println("Length of the string: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Is the string empty? " + isEmpty);

        // Concatenation
        String concatenatedString = originalString.concat(" Welcome to Java!");
        System.out.println("Concatenated String: " + concatenatedString);

        // Substring
        String substring = originalString.substring(7);
        System.out.println("Substring starting from index 7: " + substring);

        String substringRange = originalString.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);

        // Manipulating Cases
        String upperCase = originalString.toUpperCase();
        String lowerCase = originalString.toLowerCase();

        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);

        // Trimming
        String trimmedString = originalString.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Searching and Replacing
        int indexOfComma = originalString.indexOf(",");
        System.out.println("Index of ',' in the string: " + indexOfComma);

        boolean containsWorld = originalString.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);

        String replacedString = originalString.replace("Hello", "Greetings");
        System.out.println("String after replacement: " + replacedString);

        // Converting to/from Other Types
        int intValue = Integer.parseInt("123");
        double doubleValue = Double.parseDouble("3.14");

        String stringValue1 = String.valueOf(intValue);
        String stringValue2 = String.valueOf(doubleValue);

        System.out.println("Parsed Integer: " + intValue);
        System.out.println("Parsed Double: " + doubleValue);
        System.out.println("Converted Integer to String: " + stringValue1);
        System.out.println("Converted Double to String: " + stringValue2);

        // Comparing Strings
        String str1 = "Java";
        String str2 = "java";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("Are str1 and str2 equal? " + isEqual);
        System.out.println("Are str1 and str2 equal ignoring case? " + isEqualIgnoreCase);
    }
}
