package file_handling;

import java.io.FileInputStream;
import java.io.*;

public class Deserailazation {
    public static void main(String[] args) {
        try (FileInputStream fio = new FileInputStream("serail.ser")) {
            ObjectInputStream ois = new ObjectInputStream(fio);
            MyClass objx = (MyClass) ois.readObject();
            ois.close();
            fio.close();

            System.out.println("Deserailazing object");
            System.out.println("ID : " + objx.id);
            System.out.println("NAME : " + objx.name);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
