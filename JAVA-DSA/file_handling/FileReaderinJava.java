package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderinJava {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            try {
                int i = fr.read();
                while ((fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
            }
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
        }
        System.out.println();

        
        try (FileReader fr = new FileReader("file.txt");) {
            int read = fr.read();
            while (fr.ready()) {
                System.out.print((char) read);
                read = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Eror" + e.getCause());
        }
        System.out.println();
        // buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
