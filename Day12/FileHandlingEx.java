import java.io.File;

public class FileHandlingEx{
    public static void main(String[] args) {
        // Specify the path for the new folder
        String folderPath = "C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_12\\NewFolder";

        // Create a File object representing the new folder
        File folder = new File("C:\\Users\\hp\\Desktop\\JAVA_Programs\\MCA\\DAY_12\\NewFolder");

        // Create the new folder
        boolean folderCreated = folder.mkdir();
        if (folderCreated) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Failed to create folder.");
            return; // Exit if folder creation failed
        }

        // Specify the new name for the folder
        String newFolderName = "RenamedFolder";

        // Create a File object representing the new folder with the new name
        File renamedFolder = new File(folder.getParent(), newFolderName);

        // Rename the folder
       // boolean folderRenamed = folder.renameTo(renamedFolder);
        //if (folderRenamed) {
           //System.out.println("Folder renamed successfully.");
       // } else {
            //System.out.println("Failed to rename folder.");
           // return; // Exit if folder renaming failed
        //}

        // Delete the renamed folder
       // boolean folderDeleted = renamedFolder.delete();
      //  if (folderDeleted) {
            //System.out.println("Folder deleted successfully.");
        //}else {
            //System.out.println("Failed to delete folder.");
       // }
    }
}
