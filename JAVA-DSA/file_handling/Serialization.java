package file_handling;

import java.io.*;
import java.io.IOException;

class MyClass implements Serializable {
    // Serializable class
    int id;
    String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialization {
    public static void main(String[] args) {
        // Creating an object of MyClass

        MyClass obj2 = new MyClass(2, "Md Akhlak");
        try (FileOutputStream fos = new FileOutputStream("serail.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(obj2);
            out.close();
            fos.close();
            System.out.println("object2 serialized successfully");
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

    }
}
