import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        String filepath = "src/main/java/newTextFile.txt";
        File file = new File(filepath);
        boolean fStatus = file.createNewFile();
        if(fStatus)
        {
            System.out.println("File is created");
        }
        else
        {
            System.out.println("File is not created");
        }
        //get the file Object
        File fileUtil = FileUtils.getFile(filepath);
        //Read file
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        //Create directory
        File destDir = new File("src/main/resources");
        //Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);

        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, "newTextFile.txt");
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Date in copied file "+newFileData);
    }
}
