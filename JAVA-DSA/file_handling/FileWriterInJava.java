package file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterInJava {
    public static void main(String[] args) {
        // try {
        // FileWriter fw = new FileWriter("file.txt");
        // try {
        // fw.write("java progamming");

        // } finally {
        // fw.close();
        // }
        // } catch (IOException e) {
        // System.out.println("Exception" + e.getCause());
        // }

        // try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
        // osw.write(89);
        // osw.write(10); // for new line
        // osw.write('A');
        // osw.write('\n'); // for ne line
        // osw.write("AKHLAK");
        // osw.write(10);
        // char[] arr = "HELLO ".toCharArray();
        // osw.write(arr);

        // } catch (IOException e) {
        // System.out.println(e.getCause());
        // }

        try {
            File f = new File("newFile.txt");
            f.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write("Java programming");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.write(" And Java is best in the world");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter("file.txt", true))) {
            // true when we want to append
            br.write(", and java has many features");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

    }
}
