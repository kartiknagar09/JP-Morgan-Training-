import java.io.*;

public class MergeFilesWBW {
    public static void main(String[] args) {
        mergeFilesWBW("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt","C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file2.txt","C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\DAY_13\\file3.txt");
    }

    public static void mergeFilesWBW(String file1path, String file2path, String file3path) {
        try {
	BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file1.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file2.txt"));
               BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_13\\file3.txt"));
            String line;
            while ((line = reader1.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    writer.write(word + " ");
                }
            }
            while ((line = reader2.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    writer.write(word + " ");
                }
            }
            System.out.println("Files merged successfully.");
	 reader1.close();
	 reader2.close();
	writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
