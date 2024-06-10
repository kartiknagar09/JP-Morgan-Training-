import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFilePath = "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt";
        String destinationFilePath1 = "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_character.txt";
        String destinationFilePath2 = "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_word.txt";
        String destinationFilePath3 = "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_line.txt";

        // Copy file character by character
        copyCharacterByCharacter("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt", "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_character.txt");

        // Copy file word by word
        copyWordByWord("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt", "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_word.txt");

        // Copy file line by line
        copyLineByLine("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt", "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_line.txt");

        System.out.println("File copied successfully using different approaches.");
    }

    // Method to copy file character by character
    private static void copyCharacterByCharacter(String sourceFilePath, String destinationFilePath) {
        try {
	FileReader reader = new FileReader("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt");
             FileWriter writer = new FileWriter("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_character.txt");

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy file word by word
    private static void copyWordByWord(String sourceFilePath, String destinationFilePath) {
        try {
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_word.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    writer.write(word + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy file line by line
    private static void copyLineByLine(String sourceFilePath, String destinationFilePath) {
        try {
BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\destination_line.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
