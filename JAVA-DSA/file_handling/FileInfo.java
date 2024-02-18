package file_handling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Md Akhlak\\Desktop\\file.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }

        if (file.exists()) {
            System.out.println("File namne " + file.getName());
            System.out.println("file path " + file.getPath());
            System.out.println("file path " + file.getAbsolutePath());
            System.out.println("file writable " + file.canWrite());
            System.out.println("file readable " + file.canRead());
            System.out.println("file size " + file.length());
            // System.out.println("File removed " + file.delete());
        } else {
            System.out.println("File no exist");
        }
    }
}
